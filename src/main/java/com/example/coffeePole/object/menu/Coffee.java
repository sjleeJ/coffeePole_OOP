package com.example.coffeePole.object.menu;

public class Coffee implements Food {
    private String name;

    public Coffee(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
