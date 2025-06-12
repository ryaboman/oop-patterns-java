package ru.ryaboman.learning.oop_patterns.сreational.prototype;

public class Rectangle implements Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("I drawing rectangle with width: " + width + " and height: " + height);
    }

    @Override
    public Figure clone() {
        return new Rectangle(width, height);
    }
}
