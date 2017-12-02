package com.kodilla.good.patterns.challenges.taskFood2Door;

public class Application {
    public static void main(String[] args) {

        DeliveryRequest deliveryRequest = new DeliveryRequest
                ("Extra Food Shop", "apple", 20, "kg");

        DeliveryProcessor deliveryProcessor = new DeliveryProcessor();
        deliveryProcessor.order(deliveryRequest);

    }
}
