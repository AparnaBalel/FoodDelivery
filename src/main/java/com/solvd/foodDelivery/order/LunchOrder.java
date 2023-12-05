package com.solvd.foodDelivery.order;

import com.solvd.foodDelivery.food.FoodItems;
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


    public LunchOrder(List<FoodItems> foodItems) {
        super(foodItems);
    }

    public LunchOrder(int quantity) {
        super(quantity);
    }

    public LunchOrder(DeliveryPerson deliveryPerson) {
        super(deliveryPerson);
    }

    public LunchOrder(Payment payment) {
        super(payment);
    }

    public LunchOrder(LocalDateTime orderTime) {
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
