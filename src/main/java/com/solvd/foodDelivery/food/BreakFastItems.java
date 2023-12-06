package com.solvd.foodDelivery.food;

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

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public double generateRandomPrice(double min, double max) {
        return FoodItems.super.generateRandomPrice(min, max);
    }
}












