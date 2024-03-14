package com.example.coffeePole.object.menu.coffee;

import com.example.coffeePole.object.menu.Food;

public class Coffee extends Food {
    private String name;

    public Coffee(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
