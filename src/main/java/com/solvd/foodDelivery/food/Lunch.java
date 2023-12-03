package com.solvd.foodDelivery.food;


public class Lunch implements FoodItem {
    private String foodName;
    private double price;

    public Lunch(String foodName, double price) {
        this.foodName = foodName;
        this.price = price;
    }
    @Override
    public String getFoodName() {
        return foodName;
    }

    @Override
    public double getFoodPrice() {
        return generateRandomPrice(10,20);
    }
}
