package com.example.coffeePole.object.wallet;

import com.example.coffeePole.object.menu.Menu;

public class Wallet {

    private Money money;

    public Wallet(Money money){
        this.money = money;
    }
    public boolean checkMoney(Menu menu){
        if(menu.getPrice().getAmount()>money.amount) return false;
        else return true;
    }

    public void minusMoney(Menu menu){
        money.amount = money.getAmount()-menu.getPrice().getAmount();
    }

    public int getMoney(){
        return money.getAmount();
    }

}
