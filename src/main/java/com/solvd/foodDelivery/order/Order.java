package com.solvd.foodDelivery.order;

import com.solvd.foodDelivery.users.DeliveryPerson;
import com.solvd.foodDelivery.food.FoodItems;
import com.solvd.foodDelivery.payment.Payment;
import com.solvd.foodDelivery.users.Customer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;

public abstract class Order {
    private static final Logger LOGGER = LogManager.getLogger(Order.class);
    protected Customer customer;
    protected List<FoodItems> foodItems;
    protected  int quantity;
    protected Payment payment;
    protected DeliveryPerson deliveryPerson;
    private LocalDateTime orderTime;


    public Order(Customer customer) {
        this.customer = customer;
    }

    public Order(List<FoodItems> foodItems) {
        this.foodItems = foodItems;
    }

    public Order(int quantity) {
        this.quantity = quantity;
    }

    public Order(DeliveryPerson deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }
    public Order(Payment payment) {
        this.payment = payment;
    }

    public Order() {

    }

    public DeliveryPerson getDeliveryPerson() {
        return deliveryPerson;
    }

    public Order(LocalDateTime orderTime) {
        this.orderTime = LocalDateTime.now();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<FoodItems> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(List<FoodItems> foodItems) {
        this.foodItems = foodItems;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public int getQuantity() {
        return quantity;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public abstract double calculateTotal();

    public void processPayment() {
        if (payment != null) {
            payment.makePayment(calculateTotal());
        } else {
            LOGGER.warn("Payment not provided. Cannot process payment.");
        }
    }

    public void displayOrderDetails() {
        if (customer != null) {
            LOGGER.info("Customer details: " + customer);
        }
        LOGGER.info("Your total Order:");
        if (foodItems != null) {
            foodItems.forEach(item -> LOGGER.info(item.getFoodName()));
            LOGGER.info("Quantity: " + quantity);
            LOGGER.info("Total Price: $" + calculateTotal());
            if (payment != null) {
                LOGGER.info("Payment Method: " + payment.getClass().getSimpleName());
            }
            if (deliveryPerson != null) {
                LOGGER.info("Delivery Person " + deliveryPerson);
            }

            if (orderTime != null) {
                LOGGER.info("Order Time: " + orderTime);
            }
        }
    }
    public LocalDateTime waitTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyy hh:mm:ss");
        cal.add(Calendar.MINUTE, 10);
        LOGGER.info(sdf.format(cal.getTime()));
        return null;
    }
}
