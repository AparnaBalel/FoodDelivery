package com.solvd.foodDelivery.food;

import java.util.Random;

public  interface FoodItems {
     String getFoodName ();
     double getFoodPrice();
     int getQuantity();

     default double generateRandomPrice(double min, double max) {
          Random random = new Random();
          return min + (max - min) * random.nextDouble();
     }


}