package com.solvd.foodDelivery.order;

import com.solvd.foodDelivery.food.FoodItem;
import com.solvd.foodDelivery.food.Lunch;
import java.util.List;

public class LunchOrder extends  Order{
    private static final double DELIVERY_CHARGE = 5.0;

    private List<Lunch> lunch;


    public LunchOrder lunch (List<Lunch> lunch) {
        this.lunch = lunch;
        return this;
    }

    @Override
    public double calculateTotal() {
        double total = 0;
        for (FoodItem item : foodItems) {
            total += item.getFoodPrice();
        }
        return total * quantity + DELIVERY_CHARGE;
    }

}
