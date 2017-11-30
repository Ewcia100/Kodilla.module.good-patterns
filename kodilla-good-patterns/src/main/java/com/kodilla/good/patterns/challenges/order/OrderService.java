package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order(User user, LocalDateTime from, String deliveryMethod);
}
