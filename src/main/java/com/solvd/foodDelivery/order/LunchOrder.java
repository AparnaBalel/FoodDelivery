package com.solvd.foodDelivery.order;

import com.solvd.foodDelivery.food.FoodItems;
import com.solvd.foodDelivery.food.drinks.Beverage;
import com.solvd.foodDelivery.payment.Payment;
import com.solvd.foodDelivery.payment.StateTax;
import com.solvd.foodDelivery.users.Customer;
import com.solvd.foodDelivery.users.DeliveryPerson;

import java.time.LocalDateTime;
import java.util.List;

public class LunchOrder extends  Order{
    private static final double DELIVERY_CHARGE = 5.0;
    private Beverage beverage;

    public LunchOrder(Customer customer) {
        super(customer);
    }
    public void setFoodItems(List<FoodItems> foodItems) {
        this.foodItems = foodItems;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
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
