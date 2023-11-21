package com.solvd.foodDelivery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AllRestaurant  implements restaurantList{
    private static final Logger LOGGER = LogManager.getLogger(AllRestaurant.class);

    Lunch LunchMenu = new Lunch();
    BreakFast breakfastMenu = new BreakFast();
    Dinner dinnerMenu = new Dinner();
    Sides sidesMenu = new Sides();
    Dessert dessertMenu = new Dessert();
    Drinks beverageMenu = new Drinks();
    BaskinRobin baskinRobin = new BaskinRobin<>("Banana Royale", 10.50);

    public BaskinRobin getBaskinRobin() {
        return baskinRobin;
    }

    public void setBaskinRobin(BaskinRobin baskinRobin) {
        this.baskinRobin = baskinRobin;
    }

    @Override
    public void RestaurantList(String breakfast, String lunch, String sides, String drinks, String dinner, String dessert) {
        System.out.println("\n"+breakfast+ "\n"+ sides +"\n"+ lunch + "\n"+ drinks + "\n"+ breakfast + "\n"+ dessert);
    }
    public void all(){
        RestaurantList( breakfast,  lunch,  sides,  drinks,  dinner,  dessert);
    }
    public void breakfast() {
        System.out.println( breakfastMenu.getBreakfastMenu());
    }
    public Object Omelette() {
        System.out.println( breakfastMenu.omeletteOrder);
        System.out.println("hi"+ breakfastMenu.omelettePrice);
        return breakfastMenu.omeletteOrder;
    }
    public Object OmelettePrice() {
        System.out.println("hi"+ breakfastMenu.omelettePrice);
        return breakfastMenu.omelettePrice;
    }

    public Object Pancake() {
        System.out.println( breakfastMenu.pancakeOrder);;
        return breakfastMenu.pancakeOrder;
    }
    public void Lunch() {
        System.out.println( LunchMenu.LunchMenu);
    }
    public Object Soup() {
        System.out.println(LunchMenu.getSoupOrder());
        return LunchMenu.getSoupOrder();
    }
    public Object pizza() {
        System.out.println(LunchMenu.getPizzaOrder());
        return LunchMenu.getPizzaOrder();
    }
    public void Dinner() {
        System.out.println( dinnerMenu.getDinnerMenuOrder());
    }

    public Object Lasagna() {
        System.out.println( dinnerMenu.getLasagnaOrder());
        return dinnerMenu.getLasagnaOrder();
    }
    public Object Ravioli() {
        System.out.println( dinnerMenu.getRavioliOrder());
        return dinnerMenu.getRavioliOrder();
    }
    public void Sides() {

        System.out.println(sidesMenu.getSidesOrder());
    }
    public Object Fries() {
        System.out.println(sidesMenu.getFriesOrder());
        return sidesMenu.getFriesOrder();
    }
    public Object FruitCup() {
        System.out.println(sidesMenu.getFruitsOrder());
        return sidesMenu.getFruitsOrder();
    }
    public void Dessert() {
        System.out.println(dessertMenu.getDessertMenuOrder());
    }
    public String chocolateCake() {
        System.out.println(dessertMenu.getChocolateCakeOrder());
        return dessertMenu.getChocolateCakeOrder();
    }
    public Object iceCream() {
        System.out.println(dessertMenu.getIceCreamOrder());
        return dessertMenu.getIceCreamOrder();
    }
    public void Drinks() {
        System.out.println(beverageMenu.getBeverageOrder());
    }

    public Object Cappuccino() {
        System.out.println(beverageMenu.getCappuccinoOrder());
        return beverageMenu.getCappuccinoOrder();
    }
    public Object FountainSoda() {
        System.out.println(beverageMenu.getFountainOrder());
        return beverageMenu.getFountainOrder();
    }


}
