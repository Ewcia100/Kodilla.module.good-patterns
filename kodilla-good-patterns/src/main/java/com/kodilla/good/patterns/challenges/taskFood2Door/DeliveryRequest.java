package com.kodilla.good.patterns.challenges.taskFood2Door;

public class DeliveryRequest {
    private String foodSupplier;
    private String product;
    private int quantity;
    private String unit;

    public DeliveryRequest(String foodSupplier, String product, int quantity, String unit) {
        this.foodSupplier = foodSupplier;
        this.product = product;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getFoodSupplier() {
        return foodSupplier;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }
}
