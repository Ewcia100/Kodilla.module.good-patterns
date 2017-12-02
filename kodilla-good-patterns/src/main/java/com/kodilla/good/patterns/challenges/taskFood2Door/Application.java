package com.kodilla.good.patterns.challenges.taskFood2Door;

public class Application {
    public static void main(String[] args) {
        DeliveryRequestRetriever deliveryRequestRetriever = new DeliveryRequestRetriever();
        DeliveryRequest deliveryRequest = deliveryRequestRetriever.retrieve();

        DeliveryProcessor deliveryProcessor = new DeliveryProcessor();
        deliveryProcessor.order(deliveryRequest);

    }
}
