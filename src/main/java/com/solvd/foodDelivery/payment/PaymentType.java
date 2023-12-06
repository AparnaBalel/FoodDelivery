package com.solvd.foodDelivery.payment;

import com.solvd.foodDelivery.order.FoodDelivery;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
public enum PaymentType {

    CREDIT_CARD(0.02),
    PAYPAL(0.01),
    ZELLE(0.015);

    private final double bankCharge;
    PaymentType(double bankCharge) {

        this.bankCharge = bankCharge;
    }
    private static final Logger LOGGER = LogManager.getLogger(PaymentType.class);
    public double getBankCharge() {
        return bankCharge;
    }
    public static PaymentType getUserInput() {
        Scanner scanner = new Scanner(System.in);
        PaymentType choice = null;

        LOGGER.info("How would you like to pay?");
        for (PaymentType type : values()) {
            System.out.println(type.name());
        }

        while (choice == null) {
            LOGGER.info("Enter your payment method: ");
            String input = scanner.nextLine().toUpperCase();

            for (PaymentType type : values()) {
                if (type.name().equals(input)) {
                    choice = type;
                    break;
                }
            }
            if (choice == null) {
                LOGGER.info("Invalid choice. Please enter a valid payment method.");
            }
        }
        return choice;
    }
}
