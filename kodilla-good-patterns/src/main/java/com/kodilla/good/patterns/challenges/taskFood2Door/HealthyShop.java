package com.kodilla.good.patterns.challenges.taskFood2Door;

public class HealthyShop implements FoodSupplier {
    public boolean process(String foodSupplier, String product, int quantity, String unit) {
        if (unit != null) {
            System.out.println("The " + foodSupplier + " can deliver product.");
            return true;
        } else {
            System.out.println("You should chose the unit");
            return false;
        }
    }
}
