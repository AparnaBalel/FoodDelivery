package com.solvd.foodDelivery.users;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public   class DeliveryPerson extends Person {

    private static final Logger LOGGER = LogManager.getLogger(DeliveryPerson.class);

    private String vehicleNumber;

    public DeliveryPerson(String name, Object contactInfo, String vehicleNumber ) {
        super(name, contactInfo);
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public void displayInfo() {
        LOGGER.info(getName() + getContactInfo());
    }
}
