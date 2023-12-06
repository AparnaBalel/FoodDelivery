package com.solvd.foodDelivery.food;

public class DinnerItems implements FoodItems {
    private String foodName;
    private int quantity;

    public DinnerItems(String foodName, int quantity) {
        this.foodName = foodName;
        this.quantity = quantity;
    }
    @Override
    public String getFoodName() {
        return foodName;
    }

    @Override
    public double getFoodPrice() {
        return generateRandomPrice(12,22);
    }

    @Override
    public int getQuantity() {
        return 0;
    }
    @Override
    public double generateRandomPrice(double min, double max) {
        return FoodItems.super.generateRandomPrice(min, max);
    }
}
