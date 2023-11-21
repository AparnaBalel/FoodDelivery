package com.solvd.foodDelivery;

public class BreakFast   {

    private static final double DELIVERY_CHARGE = 5.0;

    Menu breakfastMenu = new Menu("omelette","pancake");
    FoodItem omelette = new FoodItem("omelette", 10) ;
    FoodItem pancake = new FoodItem("pancake",8 );

    String omeletteOrder = omelette.getMenuName();
    double omelettePrice = omelette.getPrice();
    String pancakeOrder = pancake.toString();

    public double getOmelettePrice() {
        return omelettePrice;
    }

    public void setOmelettePrice(double omelettePrice) {
        this.omelettePrice = omelettePrice;
    }

    public Menu getBreakfastMenu() {
        return breakfastMenu;
    }

    public void setBreakfastMenu(Menu breakfastMenu) {
        this.breakfastMenu = breakfastMenu;
    }

    public String getEggOrder() {
        return omeletteOrder;
    }

    public void setEggOrder(String eggOrder) {
        this.omeletteOrder = eggOrder;
    }

    public String getPancakeOrder() {
        return pancakeOrder;
    }

    public void setPancakeOrder(String pancakeOrder) {
        this.pancakeOrder = pancakeOrder;
    }


}












