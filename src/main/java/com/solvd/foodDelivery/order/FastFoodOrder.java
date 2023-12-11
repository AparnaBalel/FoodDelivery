package com.solvd.foodDelivery.order;

import com.solvd.foodDelivery.food.FoodItems;
import com.solvd.foodDelivery.payment.StateTax;

import java.util.Optional;

public class FastFoodOrder extends Order{
    private static final double DELIVERY_CHARGE = 5.0;

    public FastFoodOrder() {
    }
    @Override
    public double calculateTotal() {
        double total= 0 ;
        return Optional.ofNullable(foodItems)
                .map(items -> items.stream()
                        .mapToDouble(FoodItems::getFoodPrice)
                        .sum())
                .orElse(0.0)
                * quantity
                + StateTax.STATE_TAX_7.calculateTax(total)
                + DELIVERY_CHARGE;
    }
}
