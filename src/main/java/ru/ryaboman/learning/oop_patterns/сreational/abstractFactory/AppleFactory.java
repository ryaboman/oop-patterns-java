package ru.ryaboman.learning.oop_patterns.сreational.abstractFactory;

public class AppleFactory implements SmartphoneFactory{
    @Override
    public String getBrand() {
        return "Apple";
    }

    @Override
    public OperationSystem getOperationSystem() {
        return new OperationSystem("iOS");
    }
}
