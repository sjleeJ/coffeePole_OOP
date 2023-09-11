package com.example.coffeePole.object;

import com.example.coffeePole.object.menu.Beverage;
import com.example.coffeePole.object.menu.Coffee;
import com.example.coffeePole.object.menu.Menu;

public class CoffeeMachine {

    private Storage storage;

    public Beverage makeCoffe(Menu menu) throws Exception {
        if(!storage.check()) throw new Exception("재고가 없습니다.");
        return new Coffee(menu.getName());
    }
}
