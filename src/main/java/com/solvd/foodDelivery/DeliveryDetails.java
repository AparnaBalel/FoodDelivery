package com.solvd.foodDelivery;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DeliveryDetails extends Customer implements DriverDetails, Payment {
   Scanner scan = new Scanner(System.in);
    @Override
    public void customerDetails(String name, String address) {
    }
    @Override
    public void paymentMethod(String cardNumber, String expiryDate) {

    }
    @Override
    public void driverDetail(String driverName, String carNumber) {
    }

    public void waitTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyy hh:mm:ss");
        cal.add(Calendar.MINUTE, 10);
        System.out.println(sdf.format(cal.getTime()));
    }
    public void OrderDetails() {
       System.out.println("please enter your age ");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("Eligible for ordering food ");
        } else {
            throw new IllegalArgumentException("********IllegalArgumentException********" + "\n" + "Not Eligible for Voting");
        }

        System.out.println("please add your  name ");
        String name = scan.nextLine();
        System.out.println("please add your  delivery address ");
        String address = scan.nextLine();
        try {
            char c = name.charAt(24); // accessing 25th element
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("*******StringIndexOutOfBoundsException*******");
        }
       customerDetails(name,address);
        System.out.println("please enter your card number");
        String number = scan.nextLine();
        try {
            int a = Integer.parseInt(number);
            int b = 0;
            int c = a / b;  // cannot divide by zero
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            System.out.println("**********ArithmeticException*********" + "\n" + "Can't divide a number by 0");
        }
        System.out.println("please enter expiry date");
        String date = scan.nextLine();
        paymentMethod(number, date);
        System.out.println();
        System.out.println(name + "," + address);
        driverDetail("jacob","abd122dd");
        System.out.println("delivery time 10 minutes ");
        waitTime();
    }



}
