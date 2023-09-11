package com.example.coffeePole.object;


import com.example.coffeePole.object.wallet.Money;

import java.util.ArrayList;

//금고
public class Safe {
    private ArrayList<Money> moneys = new ArrayList<>();
    private static Safe instance;
    private Safe(){}

    public void saveMoney(Money money){
        moneys.add(money);
    }
    public static Safe getInstance(){
        if(instance == null){
            instance = new Safe();
        }
        return instance;
    }
    public int calculateMoney(){
        int price = 0;
        for(Money money:moneys){
            price += money.getAmount();
        }
        return price;
    }
}
