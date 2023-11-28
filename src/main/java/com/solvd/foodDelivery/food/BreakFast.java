package com.solvd.foodDelivery.food;

public class BreakFast implements FoodItem {
    private String foodName;
    private double price;

    public BreakFast(String foodName, double price) {
        this.foodName = foodName;
        this.price = price;
    }
    @Override
    public String foodName() {
        return foodName;
    }

    @Override
    public double foodPrice() {
        return price;
    }
}












