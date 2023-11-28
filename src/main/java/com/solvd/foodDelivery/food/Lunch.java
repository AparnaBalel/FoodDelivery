package com.solvd.foodDelivery.food;


public class Lunch implements FoodItem {
    private String foodName;
    private double price;

    public Lunch(String foodName, double price) {
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
