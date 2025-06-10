package ru.ryaboman.learning.patterns.abstractFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        SamsungFactory samsungFactory = new SamsungFactory();

        Smartphone iPhone = new Smartphone(appleFactory);
        Smartphone smartphoneSamsung = new Smartphone(samsungFactory);

        System.out.println("First smartphone");
        System.out.println("\tBrand: " + iPhone.getBrand());
        System.out.println("\tOperation System: " + iPhone.getNameOperationSystem());
        System.out.println("------------------");
        System.out.println("Second smartphone");
        System.out.println("\tBrand: " + smartphoneSamsung.getBrand());
        System.out.println("\tOperation System: " + smartphoneSamsung.getNameOperationSystem());
    }
}
