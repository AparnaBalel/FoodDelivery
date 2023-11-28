package com.solvd.foodDelivery.payment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PayPal implements Payment{

    private static final Logger LOGGER = LogManager.getLogger(PayPal.class);
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void Payment(double amount) {
        LOGGER.info("Processing PayPal payment of $" + amount);
        LOGGER.info("PayPal payment successful!");
    }
}
