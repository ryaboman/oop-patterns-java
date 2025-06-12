package ru.ryaboman.learning.oop_patterns.сreational.prototype;

public class Circle implements Figure {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("I drawing circle with radius " + radius);
    }

    @Override
    public Figure clone() {
        return new Circle(radius);
    }
}
