package com.solvd.foodDelivery.order;

import com.solvd.foodDelivery.food.FoodItem;
import com.solvd.foodDelivery.payment.Payment;
import com.solvd.foodDelivery.users.Customer;
import com.solvd.foodDelivery.users.DeliveryPerson;

import java.util.List;

public class LunchOrder extends  Order{

    private static final double DELIVERY_CHARGE = 5.0;

    public LunchOrder(Customer customer, List<FoodItem> foodItems, int quantity, Payment payment, DeliveryPerson deliveryPerson) {
        super(customer, foodItems, quantity, payment, deliveryPerson);
    }


    @Override
    public double calculateTotal() {
        double total = 0;
        for (FoodItem item : foodItems) {
            total += item.foodPrice();
        }
        return total * quantity + DELIVERY_CHARGE;
    }

}
