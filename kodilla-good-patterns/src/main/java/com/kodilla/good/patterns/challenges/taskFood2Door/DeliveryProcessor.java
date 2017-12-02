package com.kodilla.good.patterns.challenges.taskFood2Door;

public class DeliveryProcessor {

    public void order(DeliveryRequest deliveryRequest) {
        try {
            FoodSupplier name = FindSupplier.find(deliveryRequest.getFoodSupplier());
            boolean isAccepted = name.process(deliveryRequest.getFoodSupplier(),
                    deliveryRequest.getProduct(),
                    deliveryRequest.getQuantity(),
                    deliveryRequest.getUnit());

            if (isAccepted) {

                System.out.println("Delivery order accepted.");
            } else {
                System.out.println("Delivery order rejected.");
            }
        } catch (NoFoodSupplierException e) {
            System.out.println("Supplier not found.");
        }
    }
}
