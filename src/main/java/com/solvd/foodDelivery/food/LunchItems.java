package com.solvd.foodDelivery.food;


public class LunchItems implements FoodItems {
    private String foodName;
    private double price;
    private int quantity;

    public LunchItems(String foodName,int quantity) {
        this.foodName = foodName;
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

    @Override
    public int getQuantity() {
        return quantity;
    }
    @Override
    public double generateRandomPrice(double min, double max) {
        return FoodItems.super.generateRandomPrice(min, max);
    }


}
