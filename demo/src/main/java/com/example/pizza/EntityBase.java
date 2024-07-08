package com.example.pizza;

import java.util.UUID;

public abstract class EntityBase {
    private UUID id;
    protected EntityBase(UUID id){
        this.id = id;
    }

    public UUID getId(){
        return id;
    }
}
