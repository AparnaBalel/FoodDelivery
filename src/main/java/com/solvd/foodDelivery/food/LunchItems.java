package com.solvd.foodDelivery.food;


public class LunchItems implements FoodItems {
    private String foodName;
    private double price;

    public LunchItems(String foodName) {
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
