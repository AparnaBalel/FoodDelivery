package com.solvd.foodDelivery.payment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.regex.Pattern;
public class Zelle <T>implements Payment{
    private static final Logger LOGGER = LogManager.getLogger(Zelle.class);
private T recipient;
    public Zelle( T recipient) {
        if (isValidRecipient(recipient)) {
            this.recipient = recipient;
        } else {
            throw new IllegalArgumentException("Invalid information");
        }
    }
    private boolean isValidRecipient(T recipient) {
        if (recipient instanceof String) {
            String info = (String) recipient;
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

            String phoneRegex = "\\d{10}";

            return Pattern.matches(emailRegex, info) || Pattern.matches(phoneRegex, info);
        } else {
            return false;
        }
    }
    @Override
    public void makePayment(double amount) {
        LOGGER.info("Processing Zelle payment of $" + amount);
        LOGGER.info("Zelle Recipient: " + recipient);
    }
}
