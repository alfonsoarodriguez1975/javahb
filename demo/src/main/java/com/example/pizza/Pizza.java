package com.example.pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Pizza extends EntityBase {
        private String Name;
        private String Description;
        private String Url;
        private List<Ingredient> Ingredientes = new ArrayList<>();

        public String getName() {
            return Name;
        }
        public String getDescription() {
            return Description;
        }
        public String getUrl() {
            return Url;
        }

        public Double getPrecio() {
            Double precioIngredientes = 0.0;
            for (Ingredient ingredient : Ingredientes) {
                precioIngredientes += ingredient.getPrecio();
            }
            return precioIngredientes * 1.2;
        }

        public List<Ingredient> getIngredientes() {
            return Ingredientes;
        }

        private Pizza(UUID id, String name, String description, String url, 
                List<Ingredient> ingredientes) {
            super(id);
            Name = name;
            Description = description;
            Url = url;     
            this.Ingredientes = ingredientes;
        }

        public static Pizza Create (UUID id, String name, String description, String url){
            return new Pizza(id, name, description, url, new ArrayList<>());
        }      

        public void AddIngredient(Ingredient ingredient)
        {
            this.Ingredientes.add(ingredient);
        }

        public void RemoveIngredient(Ingredient ingredient)
        {
            this.Ingredientes.remove(ingredient);            
        }
        
        public void Update( String name, String description, String url){
            this.Name = name;
            this.Description = description;
            this.Url = url;
        }
}
