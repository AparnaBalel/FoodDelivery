package com.solvd.foodDelivery.food;

import java.util.Random;
public class LunchItems implements FoodItems {
    private String foodName;
    private double price;
    private int quantity;
    public LunchItems(String foodName,int quantity) {
        this.foodName = foodName;
        this.quantity = quantity;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String getFoodName() {
        return foodName;
    }

    @Override
    public double getFoodPrice() {
        return generateRandomPrice(10,20);
    }

    public static double generateRandomPrice(double min, double max) {
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }

}
