package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {
    public void createOrder(User user, LocalDateTime from, String deliveryMethod) {
        System.out.println("New order is accepted and adding to the system.");
    }

}
