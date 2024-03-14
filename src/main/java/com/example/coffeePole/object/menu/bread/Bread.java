package com.example.coffeePole.object.menu.bread;

import com.example.coffeePole.object.menu.Food;

public class Bread extends Food {
    String name;

    public Bread(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
