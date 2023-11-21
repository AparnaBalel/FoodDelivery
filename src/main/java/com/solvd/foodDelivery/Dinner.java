package com.solvd.foodDelivery;

public class Dinner {

    Menu dinnerMenu = new Menu("Lasagna Classico", "Ravioli Carbonara");
    FoodItem Lasagna = new FoodItem("Lasagna Classic", 15);
    FoodItem Ravioli = new FoodItem("Ravioli Carbonara", 12);

    String dinnerMenuOrder = dinnerMenu.toString();
    String LasagnaOrder = Lasagna.toString();
    String RavioliOrder = Ravioli.toString();

    public String getDinnerMenuOrder() {
        return dinnerMenuOrder;
    }

    public void setDinnerMenuOrder(String dinnerMenuOrder) {
        this.dinnerMenuOrder = dinnerMenuOrder;
    }

    public String getLasagnaOrder() {
        return LasagnaOrder;
    }

    public void setLasagnaOrder(String lasagnaOrder) {
        LasagnaOrder = lasagnaOrder;
    }

    public String getRavioliOrder() {
        return RavioliOrder;
    }

    public void setRavioliOrder(String ravioliOrder) {
        RavioliOrder = ravioliOrder;
    }
}
