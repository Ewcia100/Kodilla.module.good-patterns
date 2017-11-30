package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Jan", "Kowalski", "Warszawa, 00-000 Królewska 12");
        LocalDateTime orderFrom = LocalDateTime.of(2017, 11, 30, 23, 55);
        String deliveryMethod = "Paczkomat";

        return new OrderRequest(user, orderFrom, deliveryMethod);
    }
}
