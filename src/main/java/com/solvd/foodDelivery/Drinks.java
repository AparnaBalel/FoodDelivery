package com.solvd.foodDelivery;

public class Drinks {

    Menu beverage = new Menu("coffee","soda");
    FoodItem soda = new FoodItem("Fountain Drinks",3);
    FoodItem Cappuccino = new FoodItem("Cappuccino",4);

    String beverageOrder = beverage.toString();
    String fountainOrder = soda.toString();
    String CappuccinoOrder = Cappuccino.toString();

    public String getBeverageOrder() {
        return beverageOrder;
    }

    public void setBeverageOrder(String beverageOrder) {
        this.beverageOrder = beverageOrder;
    }
    public String getFountainOrder() {
        return fountainOrder;
    }

    public void setFountainOrder(String fountainOrder) {
        this.fountainOrder = fountainOrder;
    }

    public String getCappuccinoOrder() {
        return CappuccinoOrder;
    }

    public void setCappuccinoOrder(String cappuccinoOrder) {
        CappuccinoOrder = cappuccinoOrder;
    }

}
