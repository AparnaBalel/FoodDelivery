package com.solvd.foodDelivery.payment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Card implements Payment {
    private static final Logger LOGGER = LogManager.getLogger(Card.class);
    private String cardNumber;
    private String expiryDate;

    public Card(String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public void Payment(double amount) {
        LOGGER.info("Processing Credit Card payment of $" + amount);
        LOGGER.info("Credit card payment successful!");
    }
}
