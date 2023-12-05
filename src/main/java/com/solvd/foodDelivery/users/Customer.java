package com.solvd.foodDelivery.users;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public  class Customer extends Person <String>{
    private static final Logger LOGGER = LogManager.getLogger(Customer.class);

    public Customer(String name, String contactInfo) {
        super(name,  contactInfo);
    }

    public Customer(long phNumber) {
        super(phNumber);
    }

    @Override
    public void displayInfo() {
     LOGGER.info(getName() + getContactInfo());
    }
}
