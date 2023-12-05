package com.solvd.foodDelivery.food.drinks;

public enum DrinkSize {
    SMALL(2.5),
    MEDIUM(3.5),
    LARGE(4.5);

    private final double price;

    DrinkSize(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
