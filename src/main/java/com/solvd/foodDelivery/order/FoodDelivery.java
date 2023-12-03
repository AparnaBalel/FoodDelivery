package com.solvd.foodDelivery.order;

import com.solvd.foodDelivery.food.FoodItem;
import com.solvd.foodDelivery.food.Lunch;
import com.solvd.foodDelivery.payment.Card;
import com.solvd.foodDelivery.payment.Payment;
import com.solvd.foodDelivery.users.Customer;
import com.solvd.foodDelivery.users.DeliveryPerson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodDelivery {
    private static final Logger LOGGER = LogManager.getLogger(FoodDelivery.class);//
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        CurrentTime orderTime = getCurrentTime(currentTime);
        switch (orderTime) {
            case BREAKFAST:
                LOGGER.info(TodaysSpecial.BREAKFAST.toString());
                LOGGER.info("what would you like to  order for Breakfast?");
                break;
            case LUNCH:
                LOGGER.info(TodaysSpecial.LUNCH.toString());
                LOGGER.info("what would you like to order for Lunch?");
                break;
            case DINNER:
                LOGGER.info(TodaysSpecial.DINNER.toString());
                LOGGER.info("what would you like to order for Dinner?");

                break;
            case FAST_FOOD:
                LOGGER.info("do you want to order any FastFood?");
                break;
            default:
                System.out.println("Unexpected time period.");
        }

        LOGGER.info( " Take a look for Today's Special ");
        String order = scan.nextLine();
        FoodItem lunch = new Lunch(order, 10);
        LOGGER.info(" would you like to add something to drink?");
        String drink = scan.nextLine();
        FoodItem Drink = new Lunch(drink, 10);
        LOGGER.info(" please enter your name");
        String fullName = scan.nextLine();
        LOGGER.info(" please enter delivery address");
        String address = scan.nextLine();
        LOGGER.info(" please enter contact number");
        String number = scan.nextLine();
        Customer name = new Customer(fullName, address);
        LOGGER.info("please enter your card number ");
        String card = scan.nextLine();
        LOGGER.info("please enter your card expiry date ");
        String date = scan.nextLine();
        Payment creditCard = new Card(card, date);
        List<FoodItem> lunchOrder = new ArrayList<>();
        lunchOrder.add(lunch);
        lunchOrder.add(Drink);
        DeliveryPerson deliveryPerson = new DeliveryPerson("John Jacob", 1234567891, "12ab34cd");


    }

    private static CurrentTime getCurrentTime(LocalTime currentTime) {
        for (CurrentTime period : CurrentTime.values()) {
            if (period.isInTimeRange(currentTime)) {
                return period;
            }
        }
        return CurrentTime.FAST_FOOD;
    }
}