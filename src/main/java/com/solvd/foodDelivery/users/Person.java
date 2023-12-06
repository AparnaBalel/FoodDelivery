package com.solvd.foodDelivery.users;

public abstract class Person<T> {
    private String name;
    private T contactInfo;
    private long  phNumber;
    public Person(String name, T contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }
    public Person(long  phNumber) {
        if (String.valueOf(phNumber).length() == 10) {
            this.phNumber = phNumber;
        }
        else {
            throw new IllegalArgumentException("Invalid phone number");
        }
    }

    public long  getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(int phNumber) {
        this.phNumber = phNumber;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(T contactInfo) {
        this.contactInfo = contactInfo;
    }
}
