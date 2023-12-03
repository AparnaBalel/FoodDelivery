package com.solvd.foodDelivery.food;

public class FastFood implements FoodItem {
    private String foodName;
    private double price;

    public FastFood(String foodName, double price) {
        this.foodName = foodName;
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
}
