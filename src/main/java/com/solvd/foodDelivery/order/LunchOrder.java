package com.solvd.foodDelivery.order;

import com.solvd.foodDelivery.food.FoodItems;
import com.solvd.foodDelivery.payment.StateTax;
public class LunchOrder extends  Order{
    private static final double DELIVERY_CHARGE = 5.0;
    public LunchOrder() {
        super();
    }
    @Override
    public double calculateTotal() {
        double foodItemsTotal = 0;
        double tax = 0;
        if (foodItems != null) {
          foodItemsTotal = foodItems.stream().mapToDouble(FoodItems::getFoodPrice).sum();
           tax = StateTax.STATE_TAX_7.calculateTax(foodItemsTotal);
    }
        return foodItemsTotal + tax + DELIVERY_CHARGE;
    }

}
