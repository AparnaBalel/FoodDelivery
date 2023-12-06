package com.solvd.foodDelivery.users;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Restaurant extends Person <String>{
    private static final Logger LOGGER = LogManager.getLogger(Restaurant.class);

    public Restaurant(String name, String contactInfo) {
        super(name, contactInfo);
    }

    @Override
    public void displayInfo() {
        LOGGER.info("Restaurant Name: " + getName());
        LOGGER.info("Contact Information: " + getContactInfo());
    }
}
