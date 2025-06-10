package ru.ryaboman.learning.oop_patterns.сreational.builder;

public class TestPatternBuilder {
    public static void main(String[] args) {
        Burger burger = Burger.builder().beef().cheese().mayonnaise().build();
        System.out.println(burger);
    }
}
