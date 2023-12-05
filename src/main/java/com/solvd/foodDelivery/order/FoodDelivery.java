package com.solvd.foodDelivery.order;

import com.solvd.foodDelivery.food.FoodItems;
import com.solvd.foodDelivery.food.LunchItems;
import com.solvd.foodDelivery.food.drinks.Beverage;
import com.solvd.foodDelivery.payment.CreditCard;
import com.solvd.foodDelivery.payment.Payment;
import com.solvd.foodDelivery.users.Customer;
import com.solvd.foodDelivery.users.DeliveryPerson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodDelivery {
    private static final Logger LOGGER = LogManager.getLogger(FoodDelivery.class);//
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

      /*  String className ="food.LunchItems";
        try {
           Class<LunchItems> lunchClass =(Class<LunchItems>) Class.forName(className);
            Constructor<LunchItems> lunchItemsConstructor  = lunchClass.getDeclaredConstructor(String.class);
          LunchItems sandwich =   lunchItemsConstructor .newInstance("Chicken Sandwich");
            LunchItems soup =   lunchItemsConstructor .newInstance("soup");

            Order sandwichOrder = new LunchOrder((List<FoodItems>) sandwich);
            Order soupOrder = new LunchOrder((List<FoodItems>) soup);
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }*/

        LocalTime currentTime = LocalTime.now();
        MealTime orderTime = getCurrentTime(currentTime);
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
            FoodItems lunch = new LunchItems(order);
            LOGGER.info(" please enter your name");
            String fullName = scan.nextLine();
            LOGGER.info(" please enter delivery address");
            String address = scan.nextLine();
           Customer customerName = new Customer(fullName,address);
            LOGGER.info(" please enter contact number");
            long number = scan.nextLong();
           Customer customerPh = new Customer(number);
            LOGGER.info("please enter your card number ");
            String card = scan.nextLine();
            LOGGER.info("please enter your card expiry date ");
            String date = scan.nextLine();
            Payment creditCard = new CreditCard(card, date);
            List<FoodItems> lunchOrder = new ArrayList<>();
            lunchOrder.add(lunch);
            DeliveryPerson deliveryPerson = new DeliveryPerson("John Jacob",  "12ab34cd");




    }

    private static MealTime getCurrentTime(LocalTime currentTime) {
        for (MealTime period : MealTime.values()) {
            if (period.isInTimeRange(currentTime)) {
                return period;
            }
        }
        return MealTime.FAST_FOOD;
    }
}