package com.example.coffeePole.object;

import com.example.coffeePole.object.menu.Menu;
import com.example.coffeePole.object.wallet.Money;
import com.example.coffeePole.object.wallet.Wallet;

public class Guest {
    private Wallet wallet;

    public Guest(Wallet wallet){
        this.wallet = wallet;
    }

    public boolean checkMenu(Menu menu){
        return wallet.checkMoney(menu);
    }
}
