package com.solvd.foodDelivery.food.drinks;

import com.solvd.foodDelivery.food.FoodItem;

public class Drink implements FoodItem {
    private String foodName;
    private double price;
    private DrinkSize size;

    public Drink(String foodName, double price, DrinkSize size) {
        this.foodName = foodName;
        this.price = price;
        this.size = size;
    }
    @Override
    public String getFoodName() {
        return foodName;
    }

    @Override
    public double getFoodPrice() {
        return generateRandomPrice(3,6);
    }

    public DrinkSize getSize() {
        return size;
    }

}
