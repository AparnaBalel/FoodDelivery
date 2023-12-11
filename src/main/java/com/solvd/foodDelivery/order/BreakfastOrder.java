package com.solvd.foodDelivery.order;

import com.solvd.foodDelivery.food.FoodItems;
import com.solvd.foodDelivery.payment.Payment;
import com.solvd.foodDelivery.payment.StateTax;
import com.solvd.foodDelivery.users.Customer;
import com.solvd.foodDelivery.users.DeliveryPerson;

import java.time.LocalDateTime;
import java.util.List;

public class BreakfastOrder extends Order{
    private static final double DELIVERY_CHARGE = 5.0;

    public BreakfastOrder() {
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
