package com.kodilla.good.patterns.rentalCar;

public class MailService implements InformationService {
    public void inform(User user){
        System.out.println("You got an confirmation by email");
    }
}
