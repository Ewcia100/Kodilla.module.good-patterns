package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDateTime;

public class OrderRequest {
    public User user;
    public LocalDateTime from;
    public String deliveryMethod;

    public OrderRequest(final User user, final LocalDateTime from, final String deliveryMethod) {
        this.user = user;
        this.from = from;
        this.deliveryMethod = deliveryMethod;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }
}
