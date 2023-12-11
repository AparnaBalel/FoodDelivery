package com.solvd.foodDelivery.payment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreditCard implements Payment {
    private static final Logger LOGGER = LogManager.getLogger(CreditCard.class);
    private static final String DATE_FORMAT = "MM/yy";
    private String cardNumber;
    private String expiryDate;

    public CreditCard(String cardNumber, String expiryDate) {
        if(ValidCardNumber(cardNumber)&& ValidDate(expiryDate)) {
            this.cardNumber = cardNumber;
            this.expiryDate = expiryDate;
        }
        else {
            throw new IllegalArgumentException("invalid card");
        }
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

    private boolean ValidCardNumber(String cardNumber){
        return  cardNumber.matches("\\d{16}");
    }

    private boolean ValidDate(String expiryDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        dateFormat.setLenient(false);
        Date expiry;
        try {
            expiry = dateFormat.parse(expiryDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        boolean expired = expiry.before(new Date());
        return expired;
    }
    @Override
    public void makePayment(double amount) {
        LOGGER.info("Processing Credit Card payment of $" + amount);
        LOGGER.info("Credit card payment successful!");
    }
}
