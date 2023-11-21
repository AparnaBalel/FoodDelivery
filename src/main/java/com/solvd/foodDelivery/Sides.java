package com.solvd.foodDelivery;

public class Sides {

    Menu sides = new Menu("fries", "fruit cup");
    FoodItem fries = new FoodItem("Fries", 4);
    FoodItem fruits = new FoodItem("fruit cup", 5);

    String sidesOrder = sides.toString();
    String friesOrder = fries.toString();
    String fruitsOrder = fruits.toString();

    public String getSidesOrder() {
        return sidesOrder;
    }

    public void setSidesOrder(String sidesOrder) {
        this.sidesOrder = sidesOrder;
    }

    public String getFriesOrder() {
        return friesOrder;
    }

    public void setFriesOrder(String friesOrder) {
        this.friesOrder = friesOrder;
    }

    public String getFruitsOrder() {
        return fruitsOrder;
    }

    public void setFruitsOrder(String fruitsOrder) {
        this.fruitsOrder = fruitsOrder;
    }

}
