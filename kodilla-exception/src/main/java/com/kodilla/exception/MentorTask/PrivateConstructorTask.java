package com.kodilla.exception.MentorTask;

public class PrivateConstructorTask {
    private int numbersOfWheels;
    private static PrivateConstructorTask task;

    public int getNumbersOfWheels() {
        return numbersOfWheels;
    }

    private PrivateConstructorTask(int numbersOfWheels) {
        this.numbersOfWheels = numbersOfWheels;
    }

    public static PrivateConstructorTask accessToObject(int numbersOfWheels) {
        if (task == null) {
            task=new PrivateConstructorTask(numbersOfWheels);
        }
        return task;
    }
}
