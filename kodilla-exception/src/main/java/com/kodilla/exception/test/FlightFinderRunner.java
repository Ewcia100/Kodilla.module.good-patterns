package com.kodilla.exception.test;


public class FlightFinderRunner {
    public static void main(String[] args) {

        //FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("WAW", "ABC");

        try {
            FlightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Airport not found. Try another one.");
        } finally {
            System.out.println("This comment you can see always");
        }

    }
}
