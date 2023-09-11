package com.example.coffeePole.object.menu;

import com.example.coffeePole.object.wallet.Money;

public class Coffee implements Beverage{
    private String name;

    public Coffee(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
