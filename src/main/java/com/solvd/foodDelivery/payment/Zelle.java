package com.solvd.foodDelivery.payment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Zelle <T>implements Payment{

    private static final Logger LOGGER = LogManager.getLogger(Zelle.class);

private T recipient;

    public Zelle( T recipient) {
        if ((recipient instanceof String) && ((String) recipient).matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")
                || ((String) recipient).matches("\\d{10}")) {
            this.recipient = recipient;
        } else {
            throw new IllegalArgumentException("Invalid Zelle payment information");
        }
    }

    @Override
    public void makePayment(double amount) {

    }
}
