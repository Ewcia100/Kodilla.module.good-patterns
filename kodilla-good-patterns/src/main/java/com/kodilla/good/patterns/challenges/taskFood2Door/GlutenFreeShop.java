package com.kodilla.good.patterns.challenges.taskFood2Door;

public class GlutenFreeShop implements FoodSupplier {
    public boolean process(String foodSupplier, String product, int quantity, String unit) {
        if (!((unit == "kg") && (quantity > 100))) {
            System.out.println("The " + foodSupplier + " can deliver product.");
            return true;
        } else {
            System.out.println("You have to order less.");
            return false;
        }
    }
}
