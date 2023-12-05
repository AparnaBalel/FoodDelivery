package com.solvd.foodDelivery.order;

import com.solvd.foodDelivery.food.FoodItems;
import com.solvd.foodDelivery.payment.Payment;
import com.solvd.foodDelivery.payment.StateTax;
import com.solvd.foodDelivery.users.Customer;
import com.solvd.foodDelivery.users.DeliveryPerson;

import java.time.LocalDateTime;
import java.util.List;

public class DinnerOrder extends Order{
    private static final double DELIVERY_CHARGE = 5.0;

    public DinnerOrder(Customer customer) {
        super(customer);
    }

    public DinnerOrder(List<FoodItems> foodItems) {
        super(foodItems);
    }

    public DinnerOrder(int quantity) {
        super(quantity);
    }

    public DinnerOrder(DeliveryPerson deliveryPerson) {
        super(deliveryPerson);
    }

    public DinnerOrder(Payment payment) {
        super(payment);
    }

    public DinnerOrder(LocalDateTime orderTime) {
        super(orderTime);
    }

    @Override
    public double calculateTotal() {

        double total = 0;
        for (FoodItems item : foodItems) {
            total += item.getFoodPrice();
        }
        return total * quantity + StateTax.STATE_TAX_7.calculateTax(total)+ DELIVERY_CHARGE;
    }
}
