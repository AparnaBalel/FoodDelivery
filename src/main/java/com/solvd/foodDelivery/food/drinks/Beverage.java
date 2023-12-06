package com.solvd.foodDelivery.food.drinks;

import com.solvd.foodDelivery.food.FoodItems;

public class Beverage implements FoodItems {
    private String beverageName;
    private DrinkSize drinkSize;
    private int quantity;

    public Beverage(String beverageName, DrinkSize drinkSize,int quantity) {
        this.beverageName = beverageName;
        this.drinkSize = drinkSize;
        this.quantity = quantity;
    }
    @Override
    public String getFoodName() {

        return beverageName;
    }

    @Override
    public double getFoodPrice() {

        return drinkSize.getPrice();
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
