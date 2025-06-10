package ru.ryaboman.learning.oop_patterns.structural.decorator;

import java.util.List;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);

        String name = coffee.getName();
        coffee.setName(name + " Sugar");

        List<String> ingredients = coffee.getIngredients();
        ingredients.add("Sugar");
        coffee.setIngredients(ingredients);
    }

    @Override
    public double cost(){
        return (super.cost() + 5.5);
    }
}
