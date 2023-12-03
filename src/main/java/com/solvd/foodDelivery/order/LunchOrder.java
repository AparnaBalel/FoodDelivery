package com.solvd.foodDelivery.order;

import com.solvd.foodDelivery.food.FoodItem;
import com.solvd.foodDelivery.payment.Payment;
import com.solvd.foodDelivery.payment.StateTax;
import com.solvd.foodDelivery.users.Customer;
import com.solvd.foodDelivery.users.DeliveryPerson;

import java.time.LocalDateTime;
import java.util.List;

public class LunchOrder extends  Order{
    private static final double DELIVERY_CHARGE = 5.0;

    public LunchOrder(Customer customer) {
        super(customer);
    }

    public LunchOrder(List<FoodItem> foodItems, int quantity) {
        super(foodItems, quantity);
    }

    public LunchOrder(Payment payment) {
        super(payment);
    }

    public LunchOrder(DeliveryPerson deliveryPerson) {
        super(deliveryPerson);
    }

    public LunchOrder(LocalDateTime orderTime) {
        super(orderTime);
    }

    @Override
    public double calculateTotal() {
        double total = 0;
        for (FoodItem item : foodItems) {
            total += item.getFoodPrice();
        }
        return total * quantity + StateTax.STATE_TAX_7.calculateTax(total)+ DELIVERY_CHARGE;
    }

}
