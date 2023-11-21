package com.solvd.foodDelivery;

public class Dessert {

    Menu dessertMenu  = new Menu("Chocolate cake","Ice cream");
    FoodItem chocolateCake = new FoodItem("Chocolate cake", 8);
    FoodItem iceCream = new FoodItem("vanilla",8);

    String dessertMenuOrder = dessertMenu.toString();
    String chocolateCakeOrder = chocolateCake.toString();
    String iceCreamOrder = iceCream.toString();

    public String getDessertMenuOrder() {
        return dessertMenuOrder;
    }

    public void setDessertMenuOrder(String dessertMenuOrder) {
        this.dessertMenuOrder = dessertMenuOrder;
    }

    public String getChocolateCakeOrder() {
        return chocolateCakeOrder;
    }

    public void setChocolateCakeOrder(String chocolateCakeOrder) {
        this.chocolateCakeOrder = chocolateCakeOrder;
    }

    public String getIceCreamOrder() {
        return iceCreamOrder;
    }

    public void setIceCreamOrder(String iceCreamOrder) {
        this.iceCreamOrder = iceCreamOrder;
    }
}
