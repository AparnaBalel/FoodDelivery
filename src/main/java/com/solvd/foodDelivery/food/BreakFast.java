package com.solvd.foodDelivery.food;

public class BreakFast implements FoodItem {
    private String foodName;
    private double price;

    public BreakFast(String foodName, double price) {
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












