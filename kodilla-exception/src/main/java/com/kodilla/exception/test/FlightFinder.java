package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    private static Map<String, Boolean> airportsAccess = createMap();

    private static Map<String, Boolean> createMap() {
        Map<String, Boolean> result = new HashMap<>();
        result.put("CPH", true);
        result.put("WAW", true);
        result.put("SFO", false);
        result.put("JFK", true);
        result.put("DBH", false);
        result.put("DBX", true);
        result.put("FRA", true);
        return result;
    }

    public static void findFlight(Flight flight) throws RouteNotFoundException {
//        Map<String, Boolean> airportsAccess = new HashMap<>();
//        airportsAccess.put("CPH", true);
//        airportsAccess.put("WAW", true);
//        airportsAccess.put("SFO", false);
//        airportsAccess.put("JFK", true);
//        airportsAccess.put("DBH", false);
//        airportsAccess.put("DBX", true);
//        airportsAccess.put("FRA", true);

        if (!airportsAccess.containsKey(flight.getArrivalAirport()) || !airportsAccess.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException();
        } else {
            if (airportsAccess.get(flight.getDepartureAirport()) && airportsAccess.get(flight.getArrivalAirport())) {
                System.out.println("You can fly in this direction");
            } else {
                System.out.println("You can't fly in this direction");
            }

        }

    }
}
