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


    public void setDrinkSize(DrinkSize drinkSize) {
        this.drinkSize = drinkSize;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
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
    public void setBeverageName(String beverageName) {

        this.beverageName = beverageName;
    }

}
