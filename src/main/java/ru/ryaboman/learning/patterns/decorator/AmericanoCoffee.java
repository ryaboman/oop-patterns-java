package ru.ryaboman.learning.patterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class AmericanoCoffee extends Coffee {

    public AmericanoCoffee() {
        setName("Americano Coffee");
        List<String> ingredients = new ArrayList<>();
        ingredients.add("Coffee");
        setIngredients(ingredients);
    }

    @Override
    public double cost() {
        return 70.00;
    }
}
