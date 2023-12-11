package com.solvd.foodDelivery.order;

import com.solvd.foodDelivery.food.FoodItems;
import com.solvd.foodDelivery.food.LunchItems;
import com.solvd.foodDelivery.food.drinks.Beverage;
import com.solvd.foodDelivery.food.drinks.DrinkSize;
import com.solvd.foodDelivery.payment.*;
import com.solvd.foodDelivery.users.Customer;
import com.solvd.foodDelivery.users.DeliveryPerson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodDelivery {
    private static final Logger LOGGER = LogManager.getLogger(FoodDelivery.class);
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

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
                LOGGER.info("Unexpected time period.");
        }

        LOGGER.info( " Take a look for Today's Special ");
        String order = scan.nextLine();
        LOGGER.info( " How many order ");
        int totalQuantity = scan.nextInt();;
        FoodItems lunch = new LunchItems(order,totalQuantity);
        LOGGER.info( "do you want to add something to drink?");
        String drink = scan.nextLine();
        LOGGER.info( "how many drink your want to order ");
        int totalDrinks = scan.nextInt();
        LOGGER.info( "what size drink?");
        String drinkSize = scan.nextLine();
        DrinkSize size = DrinkSize.valueOf(drinkSize.toUpperCase());
        FoodItems beverage = new Beverage(drink,size,totalDrinks);
        LOGGER.info(" please enter your name");
        String fullName = scan.nextLine();
        LOGGER.info(" please enter delivery address");
        String address = scan.nextLine();
        Customer customerName = new Customer(fullName,address);
        LOGGER.info(" please enter contact number");
        long number = scan.nextLong();
        Customer customerPh = new Customer(number);
        PaymentType paymentType = PaymentType.getUserInput();
        Payment payment = createPayment(paymentType);
        List<FoodItems> lunchOrder = new ArrayList<>();
        lunchOrder.add(lunch);
        lunchOrder.add(beverage);
        DeliveryPerson deliveryPerson = new DeliveryPerson("John Jacob",  "12ab34cd");
        DeliveryPerson deliveryPersonPHNumber = new DeliveryPerson (1234567891);

        Order lunchOrder1 =new LunchOrder();

        lunchOrder1.setFoodItems(lunchOrder);
        lunchOrder1.getQuantity();
        lunchOrder1.setCustomer(customerName);
        lunchOrder1.setCustomer(customerPh);
        lunchOrder1.setPayment(payment);
        lunchOrder1.getDeliveryPerson();
        lunchOrder1.getDeliveryPerson();
        lunchOrder1.getOrderTime();
        lunchOrder1.displayOrderDetails();
        lunchOrder1.waitTime();

       List<FoodItems> foodItemsList = new ArrayList<>();
        foodItemsList.add(new LunchItems("Sandwich", 2));
        foodItemsList.add(new LunchItems("Salad",1));
        String className ="order.LunchOrder";
        try {
            Class<LunchOrder> lunchOrderClass;
            lunchOrderClass = (Class<LunchOrder>) Class.forName(className);
            Constructor<LunchOrder> lunchOrderConstructor  = lunchOrderClass.getDeclaredConstructor(String.class);

            Customer customer = new Customer("John Johnson", "johnJohnson@example.com");

           // Object lunchOrder = lunchOrderConstructor .newInstance(customer);

            Method setFoodItemsMethod = lunchOrderClass.getMethod("setFoodItems", List.class);

            setFoodItemsMethod.invoke(lunchOrder, foodItemsList);

            Method displayOrderDetailsMethod = lunchOrderClass.getMethod("displayOrderDetails");
            displayOrderDetailsMethod.invoke(lunchOrder);

        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException |
                 InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    private static Payment createPayment(PaymentType paymentType) {
        switch (paymentType) {
            case CREDIT_CARD:
                LOGGER.info("Enter your credit card number: ");
                String cardNumber = scan.nextLine();
                LOGGER.info("Enter your card's expiry date (MM/YY): ");
                String expiryDate = scan.nextLine();
                return new CreditCard(cardNumber, expiryDate);

            case PAYPAL:
                LOGGER.info("Enter your PayPal email: ");
                String paypalEmail = scan.nextLine();
                return new PayPal(paypalEmail);

            case ZELLE:
                LOGGER.info("Enter your Zelle email or phone number: ");
                String zelleInfo = scan.nextLine();
                return new Zelle<>(zelleInfo);
            default:
                throw new IllegalArgumentException("Invalid payment method");
        }
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