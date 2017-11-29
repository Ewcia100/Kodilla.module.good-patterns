package com.kodilla.stream.world;

import org.junit.Assert;

import java.math.BigDecimal;

public class WorldTestSuite {
    public void testGetPeopleQuantity(){
        // Given
        Country poland = new Country("Poland", new BigDecimal(38_000_000));
        Country hungary = new Country("Hungary", new BigDecimal(10_000_000));
        Country slovakia = new Country("Slovakia", new BigDecimal(5_500_000));
        Country czechRepublic = new Country("Czech Republic", new BigDecimal(10_600_000));
        Country greatBritain = new Country("Great Britain", new BigDecimal(60_800_000));
        Country usa = new Country("USA", new BigDecimal(325_400_000));
        Country canada = new Country("Canada", new BigDecimal(35_200_000));
        Country mexico = new Country("Mexico", new BigDecimal(119_600_000));
        Country china = new Country("China", new BigDecimal(1_403_500_000));
        Country india = new Country("India", new BigDecimal(1_324_200_000));
        Country iran = new Country("Iran", new BigDecimal(80_900_000));
        Country australiaCountry = new Country("Australia", new BigDecimal(24_700_000));

        Continent europe = new Continent("Europe");
        Continent northAmerica = new Continent("North America");
        Continent asia = new Continent("Asia");
        Continent australiaContinent = new Continent("Australia");

        europe.addCountry(poland);
        europe.addCountry(hungary);
        europe.addCountry(slovakia);
        europe.addCountry(czechRepublic);
        europe.addCountry(greatBritain);
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(mexico);
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(iran);
        australiaContinent.addCountry(australiaCountry);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(asia);
        world.addContinent(australiaContinent);

        //When
        BigDecimal allQuantity=world.getPeopleQuantityAll();

        //Then
        Assert.assertEquals(3438400000L, allQuantity);

    }
}
