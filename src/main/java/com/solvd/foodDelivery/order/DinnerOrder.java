package com.solvd.foodDelivery.order;

import com.solvd.foodDelivery.food.FoodItems;
import com.solvd.foodDelivery.payment.StateTax;

public class DinnerOrder extends Order{
    private static final double DELIVERY_CHARGE = 5.0;
    public DinnerOrder() {
    }
    @Override
    public double calculateTotal() {
        double total = 0;
        if (foodItems != null) {
            for (FoodItems item : foodItems) {
                total += item.getFoodPrice();
            }
        }
        return total * quantity + StateTax.STATE_TAX_7.calculateTax(total)+ DELIVERY_CHARGE;
    }
}
