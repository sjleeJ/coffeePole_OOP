package com.example.coffeePole.object.menu;

import com.example.coffeePole.object.wallet.Money;

public class Menu {
    private String name;
    private Money price;

    public Menu(String name,Money price){
        this.name = name;
        this.price = price;
    }
    public Money getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
