package com.solvd.foodDelivery.order;

import com.solvd.foodDelivery.food.FoodItem;
import com.solvd.foodDelivery.payment.Payment;
import com.solvd.foodDelivery.payment.StateTax;
import com.solvd.foodDelivery.users.Customer;
import com.solvd.foodDelivery.users.DeliveryPerson;

import java.time.LocalDateTime;
import java.util.List;

public class FastFoodOrder extends Order{
    private static final double DELIVERY_CHARGE = 5.0;

    public FastFoodOrder(Customer customer) {
        super(customer);
    }

    public FastFoodOrder(List<FoodItem> foodItems, int quantity) {
        super(foodItems, quantity);
    }

    public FastFoodOrder(Payment payment, StateTax stateTax) {
        super(payment);
    }

    public FastFoodOrder(DeliveryPerson deliveryPerson) {
        super(deliveryPerson);
    }

    public FastFoodOrder(LocalDateTime orderTime) {
        super(orderTime);
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
