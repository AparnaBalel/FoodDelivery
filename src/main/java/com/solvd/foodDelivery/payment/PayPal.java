package com.solvd.foodDelivery.payment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Pattern;

public class  PayPal implements Payment{
    private static final Logger LOGGER = LogManager.getLogger(PayPal.class);
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (ValidEmail(email)) {
            this.email = email;
        }else {
            throw new IllegalArgumentException("please Enter valid Email Id");
        }
    }

    private boolean ValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Pattern.matches(emailRegex, email);
    }

    @Override
    public void makePayment(double amount) {
        LOGGER.info("Processing PayPal payment of $" + amount);
        LOGGER.info("PayPal Email: " + email);
    }
}
