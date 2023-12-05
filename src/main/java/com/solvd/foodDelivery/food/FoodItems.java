package com.solvd.foodDelivery.food;

import java.util.Random;

public  interface FoodItems {
     String getFoodName ();
     double getFoodPrice();

     default double generateRandomPrice(double min, double max) {
          Random random = new Random();
          return min + (max - min) * random.nextDouble();
     }


}