package ru.ryaboman.learning.oop_patterns.behavioral.observer;

public class PrintObserver implements IObserver {
    String name;

    public PrintObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Hi, I " + name + "!");
    }
}
