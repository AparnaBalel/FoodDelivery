package com.solvd.foodDelivery.users;


import com.solvd.foodDelivery.order.FoodDelivery;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public  class Customer extends Person {
    private static final Logger LOGGER = LogManager.getLogger(Customer.class);

    public Customer(String name, Object contactInfo) {
        super(name, contactInfo);
    }

    @Override
    public void displayInfo() {
     LOGGER.info(getName() + getContactInfo());
    }
}
