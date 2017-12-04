package com.kodilla.good.patterns.challenges.findFlights;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public final class FlightDatabase {
    private static final String WAW="Warszawa";
    private static final String LUB="Lublin";
    private static final String KRA="Kraków";
    private static final String GD="Gdańsk";
    private static final String WR="Wrocław";
    private static final String LOD="Łódź";
    private static final String RZE="Rzeszów";

    private Set<Flight> flightSet = new HashSet<>();

    public FlightDatabase() {
        flightSet.add(new Flight(WAW, LUB));
        flightSet.add(new Flight(WAW, KRA));
        flightSet.add(new Flight(WAW, GD));
        flightSet.add(new Flight(WAW, WR));
        flightSet.add(new Flight(WAW, LOD));
        flightSet.add(new Flight(LOD, WAW));
        flightSet.add(new Flight(LOD, RZE));
        flightSet.add(new Flight(LOD, WR));
        flightSet.add(new Flight(WR, KRA));
        flightSet.add(new Flight(WR, GD));
        flightSet.add(new Flight(WR, WAW));
        flightSet.add(new Flight(LUB, WAW));
        flightSet.add(new Flight(LUB, RZE));

    }

    public Set<Flight> getFlightSet() {
        return new HashSet<>(flightSet);
    }


    @Override
    public String toString() {
        return "FlightDatabase{" +
                "flightSet=" + flightSet +
                '}';
    }
    public List<String> findAllFlightsFrom(String cityFrom, boolean verbose) {
        List<String> flightsFrom = flightSet.stream()
                .filter(flight -> flight.getFlightFrom().equals(cityFrom))
                .map(flight -> flight.getFlightTo())
                .collect(Collectors.toList());
        if (verbose) {
            System.out.println("All flights from " + cityFrom+":");
            flightsFrom.stream()
                    .forEach(System.out::println);
        }
        return flightsFrom;
    }

    public List<String> findAllFlightsFrom(String cityFrom) {
        return findAllFlightsFrom(cityFrom, true);
    }

    public List<String> findAllFlightsTo(String cityTo, boolean verbose) {
        List<String> flightsTo = flightSet.stream()
                .filter(flight -> flight.getFlightTo().equals(cityTo))
                .map(flight -> flight.getFlightFrom())
                .collect(Collectors.toList());

        if (verbose) {
            System.out.println("All flights to " + cityTo+":");
            flightsTo.stream()
                    .forEach(System.out::println);

        }
        return flightsTo;
    }

    public List<String> findAllFlightsTo(String cityTo) {
        return findAllFlightsTo(cityTo, true);
    }

    public void findFlightWithChange(String cityFrom, String cityTo) {
        List<String> flightsFromCity = findAllFlightsFrom(cityFrom, false);
        List<String> flightsToCity = findAllFlightsTo(cityTo, false);


        List<String> list = new ArrayList<>();
        for (String fly : flightsFromCity) {

            if (flightsToCity.contains(fly)) {
                list.add(fly);
            }
        }

        System.out.println(cityFrom + "->" +"You can fly by"+ list + "->" + cityTo);
    }
}


