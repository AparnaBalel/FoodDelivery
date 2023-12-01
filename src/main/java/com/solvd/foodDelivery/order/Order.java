package com.solvd.foodDelivery.order;

import com.solvd.foodDelivery.payment.StateTax;
import com.solvd.foodDelivery.users.DeliveryPerson;
import com.solvd.foodDelivery.food.FoodItem;
import com.solvd.foodDelivery.payment.Payment;
import com.solvd.foodDelivery.payment.Zelle;
import com.solvd.foodDelivery.users.Customer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public abstract class Order {
    private static final Logger LOGGER = LogManager.getLogger(Order.class);
    protected Customer customer;
    protected List<FoodItem> foodItems;
    protected  int quantity;
    protected Payment payment;
    protected StateTax stateTax;
    protected DeliveryPerson deliveryPerson;
    private LocalDateTime orderTime;

    public Order() {
        this.foodItems = new ArrayList<>();
    }

    public Order(List<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }

    public Order(int quantity) {
        this.quantity = quantity;
    }

    public Order(Customer customer) {
        this.customer = customer;
    }

    public Order(DeliveryPerson deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }

    public DeliveryPerson getDeliveryPerson() {
        return deliveryPerson;
    }

    public Order(Payment payment) {
        this.payment = payment;
    }

    public Order(StateTax stateTax) {
        this.stateTax = stateTax;
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

    public List<FoodItem> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(List<FoodItem> foodItems) {
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
        payment.Payment(calculateTotal());
    }

    public void displayOrderDetails() {

        LOGGER.info("Customer detail " + customer );
        LOGGER.info("Your total Order:");
        for (FoodItem item : foodItems) {
            LOGGER.info(item.getFoodName());
        }
        LOGGER.info("Quantity: " + quantity);
        LOGGER.info("Total Price: $" + calculateTotal());
        LOGGER.info("Payment Method: " + payment.getClass().getSimpleName());
        LOGGER.info("Delivery Person " + deliveryPerson);
        LOGGER.info("Order Time: " + orderTime);
    }
    public LocalDateTime waitTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyy hh:mm:ss");
        cal.add(Calendar.MINUTE, 10);
        LOGGER.info(sdf.format(cal.getTime()));
        return null;
    }
}
