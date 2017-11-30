package com.kodilla.good.patterns.challenges;

import java.util.*;

public final class MovieStore {
    private static final String IRON_MAN_PL = "Żelazny Człowiek";
    private static final String IRON_MAN_EN = "Iron Man";
    private static final String IRON_MAN_EN_SHORTCUT = "IM";

    private static final String AVENGERS_PL = "Mściciele";
    private static final String AVENGERS_EN = "Avengers";
    private static final String AVENGERS_EN_SHORTCUT = "AV";


    private static final String FLASH_PL = "Błyskawica";
    private static final String FLASH_EN = "Flash";
    private static final String FLASH_EN_SHORTCUT = "FL";

    private final Map<String, List<String>> moviesTitlesWithTranslations = new HashMap<>();


    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add(IRON_MAN_PL);
        ironManTranslations.add(IRON_MAN_EN);

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add(AVENGERS_PL);
        avengersTranslations.add(AVENGERS_EN);

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add(FLASH_PL);
        flashTranslations.add(FLASH_EN);

        moviesTitlesWithTranslations.put(IRON_MAN_EN_SHORTCUT, ironManTranslations);
        moviesTitlesWithTranslations.put(AVENGERS_EN_SHORTCUT, avengersTranslations);
        moviesTitlesWithTranslations.put(FLASH_EN_SHORTCUT, flashTranslations);


        return new HashMap<>(moviesTitlesWithTranslations);


    }
}
