package com.solvd.foodDelivery.payment;

import java.util.Scanner;
public enum PaymentType {
    CREDIT_CARD(0.02),
    PAYPAL(0.01),
    ZELLE(0.015);

    private final double bankCharge;
    PaymentType(double bankCharge) {

        this.bankCharge = bankCharge;
    }

    public double getBankCharge() {
        return bankCharge;
    }
    public static PaymentType getUserInput() {
        Scanner scanner = new Scanner(System.in);
        PaymentType choice = null;

        System.out.println("How would you like to pay?");
        for (PaymentType type : values()) {
            System.out.println(type.name());
        }

        while (choice == null) {
            System.out.print("Enter your payment method: ");
            String input = scanner.nextLine().toUpperCase();

            for (PaymentType type : values()) {
                if (type.name().equals(input)) {
                    choice = type;
                    break;
                }
            }
            if (choice == null) {
                System.out.println("Invalid choice. Please enter a valid payment method.");
            }
        }
        return choice;
    }
}
