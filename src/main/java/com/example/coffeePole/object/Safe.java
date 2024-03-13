package com.example.coffeePole.object;


import com.example.coffeePole.object.menu.Menu;
import com.example.coffeePole.object.wallet.Money;

import java.util.ArrayList;

//금고
public class Safe {
    private ArrayList<Menu> moneys = new ArrayList<Menu>();
    private static Safe instance;
    private Safe(){}

    public void saveMoney(Menu menu){
        moneys.add(menu);
    }
    public static Safe getInstance(){
        if(instance == null){
            instance = new Safe();
        }
        return instance;
    }
    public int calculateMoney(){
        int price = 0;
        for(Menu menu:moneys){
            price += menu.getPrice().getAmount();
        }
        return price;
    }

}
