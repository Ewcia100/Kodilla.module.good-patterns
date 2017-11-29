package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String shapeName;
    double field;


    public Triangle(double sideLength, double height) {
        this.shapeName = "triangle";
        this.field = 0.5 * sideLength * height;

    }

    public String getShapeName() {
        return this.shapeName;
    }

    public double getField() {
        return this.field;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}
