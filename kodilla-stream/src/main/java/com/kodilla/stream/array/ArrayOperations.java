package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .forEach(index -> System.out.println(numbers[index]));

        double average = IntStream.range(0, numbers.length)
                .map(index -> numbers[index])
                .average()
                .getAsDouble();
        return average;


    }
}
