package ru.ryaboman.learning.oop_patterns.сreational.abstractFactory;

public class Smartphone {
    private String brand;
    private OperationSystem operationSystem;

    public Smartphone(SmartphoneFactory smartphoneFactory) {
        this.brand = smartphoneFactory.getBrand();
        this.operationSystem = smartphoneFactory.getOperationSystem();
    }

    public String getBrand() {
        return brand;
    }

    public String getNameOperationSystem() {
        return operationSystem.getNameOperationSystem();
    }
}
