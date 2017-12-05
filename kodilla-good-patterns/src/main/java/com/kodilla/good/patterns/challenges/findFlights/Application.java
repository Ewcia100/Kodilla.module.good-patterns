package com.kodilla.good.patterns.challenges.findFlights;

public class Application {
    public static void main(String[] args) {

        FlightFinder flightFinder=new FlightFinder();
        flightFinder.findAllFlightsFromPrint("Warszawa");
        flightFinder.findAllFlightsToPrint("Lublin");
        flightFinder.findFlightWithChange("Łódź", "Gdańsk");


    }
}
