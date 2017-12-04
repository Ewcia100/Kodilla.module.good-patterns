package com.kodilla.good.patterns.challenges.findFlights;

public class Application {
    public static void main(String[] args) {

        FlightDatabase flightDatabase = new FlightDatabase();
        flightDatabase.findAllFlightsFrom("Warszawa");
        flightDatabase.findAllFlightsTo("Lublin");
        flightDatabase.findFlightWithChange("Łódź", "Gdańsk");


    }
}
