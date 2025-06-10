package ru.ryaboman.learning.patterns.abstractFactory;

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
