package com.solvd.foodDelivery.food;

public class FastFood implements FoodItem {
    private String foodName;
    private double price;

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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
