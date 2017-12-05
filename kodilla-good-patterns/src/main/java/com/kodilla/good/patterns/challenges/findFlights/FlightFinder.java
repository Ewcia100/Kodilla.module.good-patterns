package com.kodilla.good.patterns.challenges.findFlights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class FlightFinder {

    public List<String> findAllFlightsFrom(String cityFrom) {
        List<String> flightsFrom = FlightDatabase.accessToSet().stream()
                .filter(flight -> flight.getFlightFrom().equals(cityFrom))
                .map(flight -> flight.getFlightTo())
                .collect(Collectors.toList());
        return flightsFrom;
    }

    public void findAllFlightsFromPrint(String cityFrom) {
        System.out.println("From " + cityFrom + " you can fly to -> " + findAllFlightsFrom(cityFrom));
    }

    public List<String> findAllFlightsTo(String cityTo) {
        List<String> flightsTo = FlightDatabase.accessToSet().stream()
                .filter(flight -> flight.getFlightTo().equals(cityTo))
                .map(flight -> flight.getFlightFrom())
                .collect(Collectors.toList());
        return flightsTo;
    }

    public void findAllFlightsToPrint(String cityTo) {
        System.out.println("To " + cityTo + " you can fly from <- " + findAllFlightsTo(cityTo));
    }

    public void findFlightWithChange(String cityFrom, String cityTo) {
        List<String> flightsFromCity = findAllFlightsFrom(cityFrom);
        List<String> flightsToCity = findAllFlightsTo(cityTo);


        List<String> list = new ArrayList<>();
        for (String fly : flightsFromCity) {

            if (flightsToCity.contains(fly)) {
                list.add(fly);
            }
        }

        System.out.println(cityFrom + "->" + "You can fly by" + list + "->" + cityTo);
    }
}
