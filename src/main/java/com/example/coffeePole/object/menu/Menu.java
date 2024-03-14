package com.example.coffeePole.object.menu;

import com.example.coffeePole.object.wallet.Money;

public class Menu {

    private String category;
    private String name;
    private Money price;

    public Menu(String category,String name,Money price){
        this.category = category;
        this.name = name;
        this.price = price;
    }
    public Money getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }
}
