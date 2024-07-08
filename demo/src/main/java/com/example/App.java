package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.example.pizza.Ingredient;
import com.example.pizza.Pizza;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Ingredient ingredient = Ingredient.create(UUID.randomUUID(), "tomate", 1.0);
        System.out.println(ingredient.getId());
        System.out.println(ingredient.getPrecio());
        ingredient.update("tomate", 2.0);
        System.out.println(ingredient.getPrecio());
        Ingredient ingredient2 = Ingredient.create(UUID.randomUUID(), "masa", 3.0);
        Ingredient ingredient3 = Ingredient.create(UUID.randomUUID(), "queso", 1.0);
        Pizza pizza = Pizza.Create(UUID.randomUUID(), "Margarita","Soy una pizza margarita", "http://www.google.es");
        pizza.AddIngredient(ingredient);
        pizza.AddIngredient(ingredient2);
        pizza.AddIngredient(ingredient3);
        System.out.println(pizza.getPrecio());
        System.out.println( "Hello World!" );
    }
}
