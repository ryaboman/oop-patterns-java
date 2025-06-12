package ru.ryaboman.learning.oop_patterns.сreational.prototype;

public class TestPrototype {
    public static void main(String[] args) {
        Figure figure = new Rectangle(30,40);
        Figure clonedFigure = figure.clone();
        figure.draw();
        clonedFigure.draw();

        figure = new Circle(30);
        clonedFigure = figure.clone();
        figure.draw();
        clonedFigure.draw();
    }
}
