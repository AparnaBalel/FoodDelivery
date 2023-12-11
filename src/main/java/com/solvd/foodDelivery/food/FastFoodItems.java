package com.solvd.foodDelivery.food;

import java.util.Random;

public class FastFoodItems implements FoodItems {
    private String foodName;
    private double price;

    public FastFoodItems(String foodName, double price) {
        this.foodName = foodName;
        this.price = price;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getFoodName() {
        return foodName;
    }

    @Override
    public double getFoodPrice() {
        return generateRandomPrice(3,12);
    }

    public static double generateRandomPrice(double min, double max) {
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }

}
