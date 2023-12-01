package com.solvd.foodDelivery.users;

public abstract class Person<T> {
    private String name;
    private T contactInfo;

    public Person(String name, T contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
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
