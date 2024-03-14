package com.example.coffeePole.object;

import com.example.coffeePole.object.menu.coffee.Coffee;
import com.example.coffeePole.object.menu.Menu;

public class CoffeeMachine {

    private final Storage storage;

    public CoffeeMachine(Storage storage) {
        this.storage = storage;
    }

    public Coffee makeCoffe(Menu menu) throws Exception {
        if(!storage.check(menu)) throw new Exception("재고가 없습니다.");
        return new Coffee(menu.getName());
    }
}
