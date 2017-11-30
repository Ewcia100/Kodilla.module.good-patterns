package com.kodilla.good.patterns.rentalCar;

import java.time.LocalDateTime;

public interface RentalService {
    public boolean rent(User user, LocalDateTime from, LocalDateTime to);
}
