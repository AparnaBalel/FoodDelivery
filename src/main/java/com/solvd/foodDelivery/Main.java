package com.solvd.foodDelivery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    static Scanner scan = new Scanner(System.in);
    static AllRestaurant restaurant = new AllRestaurant();
   static DeliveryDetails customer = new DeliveryDetails();
    static ArrayList<Object> list = new ArrayList<>();

    public static void main(String[] args) {
        LOGGER.info("worked");
        orderFood();
        System.out.println("do you want to add more food items?");
        String order = scan.nextLine();
        if (order.equalsIgnoreCase("yes")) {
            orderFood();
            System.out.println("do you want to add more food items?");
            String addmore = scan.nextLine();
            if (addmore.equalsIgnoreCase("yes")){
                orderFood();
            }
            else if (addmore.equalsIgnoreCase("no")) {
                customer.OrderDetails();
                for (Object fruit : list) {
                    double total = 0;
                    System.out.println("this is your order details: " + fruit);
                }
        }}
        else if (order.equalsIgnoreCase("no")) {
             customer.OrderDetails();
            for (Object fruit : list) {
                double total = 0;
                System.out.println("this is your order details: " + fruit);
            }
         }
        System.out.print("yay! free dessert for you"+ ":"+restaurant.getBaskinRobin());
    }

        static void orderFood() {
            restaurant.all();
           // ArrayList<Object> list = new ArrayList<>();
            System.out.println("choose want you want to order from list");
            String choose = scan.nextLine();
            switch (choose) {
                case "breakfast":
                    restaurant.breakfast();
                    String breakfast = scan.nextLine();
                    if (breakfast.equalsIgnoreCase("omelette")) {
                        list.add(restaurant.Omelette());
                    } else if (breakfast.equalsIgnoreCase("pancake")) {
                        list.add(restaurant.Pancake());
                    }
                    break;
                case "lunch":
                    restaurant.Lunch();
                    String lunch = scan.nextLine();
                    if (lunch.equalsIgnoreCase("soup")) {
                        list.add(restaurant.Soup());
                    } else if (lunch.equalsIgnoreCase("pizza")) {
                        list.add(restaurant.pizza());
                    }
                    break;
                case "dinner":
                    restaurant.Dinner();
                    String dinner = scan.nextLine();
                    if (dinner.equalsIgnoreCase("Lasagna")) {
                        list.add(restaurant.Lasagna());
                    } else if (dinner.equalsIgnoreCase("Ravioli")) {
                        list.add(restaurant.Ravioli());
                    }
                    break;
                case "sides":
                    restaurant.Sides();
                    String sides = scan.nextLine();
                    if (sides.equalsIgnoreCase("fries")) {
                        list.add(restaurant.Fries());
                    } else if (sides.equalsIgnoreCase("fruit cup")) {
                        list.add(restaurant.FruitCup());
                    }
                    break;
                case "dessert":
                    restaurant.Dessert();
                    String dessert = scan.nextLine();
                    if (dessert.equalsIgnoreCase("chocolate Cake")) {
                        list.add(restaurant.chocolateCake());
                    } else if (dessert.equalsIgnoreCase("ice Cream")) {
                        list.add(restaurant.iceCream());
                    }
                    break;
                case "drinks":
                    restaurant.Drinks();
                    String drinks = scan.nextLine();
                    if (drinks.equalsIgnoreCase("soda")) {
                        list.add(restaurant.FountainSoda());
                    } else if (drinks.equalsIgnoreCase("coffee")) {
                        list.add(restaurant.Cappuccino());
                    }
                    break;
            }
            for (Object fruit : list) {
                double total = 0;
                System.out.println("successfully added to list: " + fruit);

            }
        }



}