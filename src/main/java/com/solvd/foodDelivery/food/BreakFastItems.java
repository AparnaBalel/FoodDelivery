package com.solvd.foodDelivery.food;

import java.util.Random;

public class BreakFastItems implements FoodItems {
    private String foodName;
    private int quantity;

    public BreakFastItems(String foodName, int quantity) {
        this.foodName = foodName;
        this.quantity = quantity;
    }
    @Override
    public String getFoodName() {
        return foodName;
    }

    @Override
    public double getFoodPrice() {
        return generateRandomPrice(7, 15);
    }

    public static double generateRandomPrice(double min, double max) {
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }
}












