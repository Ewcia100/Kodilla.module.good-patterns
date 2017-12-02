package com.kodilla.good.patterns.challenges.taskFood2Door;

public class DeliveryRequestRetriever {
    public DeliveryRequest retrieve() {

        String foodSupplier = "Extra Food Shop";
        String product = "apple";
        int quantity = 20;
        String unit = "kg";

        return new DeliveryRequest(foodSupplier, product, quantity, unit);
    }
}
