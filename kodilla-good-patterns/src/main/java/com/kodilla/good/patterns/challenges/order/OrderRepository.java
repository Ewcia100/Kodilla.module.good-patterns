package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder(User user, LocalDateTime from, String deliveryMethod);
}
