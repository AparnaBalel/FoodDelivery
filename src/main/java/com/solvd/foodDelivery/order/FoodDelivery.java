package com.solvd.foodDelivery.order;

import com.solvd.foodDelivery.food.FoodItems;
import com.solvd.foodDelivery.food.LunchItems;
import com.solvd.foodDelivery.food.drinks.Beverage;
import com.solvd.foodDelivery.food.drinks.DrinkSize;
import com.solvd.foodDelivery.payment.CreditCard;
import com.solvd.foodDelivery.payment.Payment;
import com.solvd.foodDelivery.users.Customer;
import com.solvd.foodDelivery.users.DeliveryPerson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FoodDelivery {
    private static final Logger LOGGER = LogManager.getLogger(FoodDelivery.class);
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Customer customerNameAddress = new Customer("John Doe", "123 Main Street");
        Customer customerPhNumber = new Customer( 1234567890);
        List<FoodItems> foodItemsList = Arrays.asList(
                new LunchItems("Sandwich",2),
                new LunchItems("Salad",1)
        );
        Beverage beverage = new Beverage("Soda", DrinkSize.MEDIUM,2);

        LunchOrder lunchOrder = new LunchOrder(customerNameAddress);

        lunchOrder.setFoodItems(foodItemsList);
        lunchOrder.setBeverage(beverage);

        lunchOrder.displayOrderDetails();


       /*List<FoodItems> foodItemsList = new ArrayList<>();
        foodItemsList.add(new LunchItems("Sandwich"));
        foodItemsList.add(new LunchItems("Salad"));
        String className ="order.LunchOrder";
        try {

            Class<LunchOrder> lunchOrderClass =(Class<LunchOrder>) Class.forName(className);
            Constructor<LunchOrder> lunchOrderConstructor  = lunchOrderClass.getDeclaredConstructor(String.class);

            Customer customer = new Customer("John Johnson", "johnJohnson@example.com");

            Object lunchOrder = lunchOrderConstructor .newInstance(customer);

            Method setFoodItemsMethod = lunchOrderClass.getMethod("setFoodItems", List.class);

            setFoodItemsMethod.invoke(lunchOrder, foodItemsList);

            Method displayOrderDetailsMethod = lunchOrderClass.getMethod("displayOrderDetails");
            displayOrderDetailsMethod.invoke(lunchOrder);

        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException |
                 InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }*/

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