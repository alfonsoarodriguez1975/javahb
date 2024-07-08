package com.example;

import java.util.UUID;

import com.example.pizza.Ingredient;

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
        System.out.println( "Hello World!" );
    }
}
