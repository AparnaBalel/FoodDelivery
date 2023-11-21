package com.solvd.foodDelivery;

public  class FoodItem{
    private String menuName;
    private double price;

    public FoodItem(String menuName, double price) {
        this.menuName = menuName;
        this.price = price;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return  menuName + "- $" +price ;

    }


}