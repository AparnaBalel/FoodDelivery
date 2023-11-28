package com.solvd.foodDelivery.users;

public   class DeliveryPerson extends Person {

    private String vehicleNumber;

    public DeliveryPerson(String name, String phoneNumber, String vehicleNumber) {
        super(name, phoneNumber);
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}
