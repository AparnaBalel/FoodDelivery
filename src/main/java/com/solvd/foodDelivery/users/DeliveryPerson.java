package com.solvd.foodDelivery.users;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public   class DeliveryPerson extends Person <String> {
    private static final Logger LOGGER = LogManager.getLogger(DeliveryPerson.class);
    private String vehicleNumber;
    public DeliveryPerson(String name, String  vehicleNumber) {
        super(name, vehicleNumber);
    }

    public DeliveryPerson(long phNumber) {
        super(phNumber);
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    @Override
    public void displayInfo() {

        LOGGER.info("Delivery Person Name: " + getName());
        LOGGER.info("Contact Information: " + getContactInfo());
        LOGGER.info("Vehicle Number: " + vehicleNumber);
    }
}
