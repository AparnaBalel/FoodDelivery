package com.solvd.foodDelivery;

public class BaskinRobin<T, U> {
    private T menu;
    private U price;

    public BaskinRobin(T menu, U price) {
        this.menu = menu;
        this.price = price;

    }
    public U getPrice() {
        return price;
    }

    public void setPrice(U price) {
        this.price = price;
    }

    public T getMenu() {
        return menu;
    }

    public void setMenu(T menu) {
        this.menu = menu;
    }
    public void BaskinRobinMenu() {
        System.out.println(menu);

    }
    @Override
    public String toString() {
        return "\n" + "BaskinRobin: " + "," + menu + "," + price + ", " ;
    }
}
