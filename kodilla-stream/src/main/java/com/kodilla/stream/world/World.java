package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continentList=new ArrayList<>();

    public List<Continent> getContinentList() {
        return new ArrayList<>(continentList);
    }

    public void addContinent(Continent continent){
        continentList.add(continent);
    }
    public BigDecimal getPeopleQuantityAll(){
        return continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum=sum.add(current));


    }
}
