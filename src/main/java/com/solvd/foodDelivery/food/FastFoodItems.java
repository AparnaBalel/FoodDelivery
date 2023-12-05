package com.solvd.foodDelivery.food;

public class FastFoodItems implements FoodItems {
    private String foodName;
    private double price;

    public FastFoodItems(String foodName, double price) {
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
