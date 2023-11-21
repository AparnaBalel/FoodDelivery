package com.solvd.foodDelivery;

public class Lunch {

    Menu lunchMenu = new Menu("Soup Salad and Sandwich","Pizza");
    FoodItem Soup = new FoodItem("Soup, Salad and sandwich ",10);
    FoodItem Pizza = new FoodItem("Pizza",10);

    String LunchMenu = lunchMenu.toString();
    String soupOrder = Soup.toString();
    String pizzaOrder = Pizza.toString();

    public String getLunchMenu() {
        return LunchMenu;
    }

    public void setLunchMenu(String lunchMenu) {
        LunchMenu = lunchMenu;
    }

    public String getSoupOrder() {
        return soupOrder;
    }

    public void setSoupOrder(String soupOrder) {
        this.soupOrder = soupOrder;
    }

    public String getPizzaOrder() {
        return pizzaOrder;
    }

    public void setPizzaOrder(String pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }
}
