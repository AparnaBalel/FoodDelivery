package com.solvd.foodDelivery.payment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Zelle implements Payment{

    private static final Logger LOGGER = LogManager.getLogger(Zelle.class);

    private String phoneNumber;

    public Zelle(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void Payment(double amount) {
        LOGGER.info("Processing Zelle payment of $" + amount);
        LOGGER.info("Zelle payment successful!");
    }
}
