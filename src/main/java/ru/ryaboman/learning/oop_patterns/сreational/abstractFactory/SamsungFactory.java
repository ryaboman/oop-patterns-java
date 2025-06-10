package ru.ryaboman.learning.oop_patterns.сreational.abstractFactory;

public class SamsungFactory implements SmartphoneFactory{
    @Override
    public String getBrand() {
        return "Samsung";
    }

    @Override
    public OperationSystem getOperationSystem() {
        return new OperationSystem("Android");
    }
}
