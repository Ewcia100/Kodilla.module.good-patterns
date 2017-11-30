package com.kodilla.good.patterns.rentalCar;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {
    public void createRental(User user, LocalDateTime from, LocalDateTime to) {
        System.out.println("You add to database");
    }

}
