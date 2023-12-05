package com.solvd.foodDelivery.food;

public class BreakFastItems implements FoodItems {
    private String foodName;
    private double price;

    public BreakFastItems(String foodName, double price) {
        this.foodName = foodName;
        this.price = price;
    }

    @Override
    public String getFoodName() {
        return foodName;
    }

    @Override
    public double getFoodPrice() {
        return generateRandomPrice(7, 15);
    }
}












