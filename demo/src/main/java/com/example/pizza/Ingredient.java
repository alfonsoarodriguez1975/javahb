package com.example.pizza;

import java.util.UUID;

public class Ingredient extends EntityBase {
    
    private String name;
    private Double precio;
    
    public String getName() {
        return name;
    }

    public Double getPrecio() {
        return precio;
    }

    private Ingredient(UUID id, String name, Double precio) {
        super(id);
        this.name = name;
        this.precio = precio;
    }

    public void update(String name, Double precio)
    {
        this.name = name;
        this.precio = precio;    
    }

    public static Ingredient create(UUID id, String name, Double precio){
        return new Ingredient(id, name, precio);        
    }
}
