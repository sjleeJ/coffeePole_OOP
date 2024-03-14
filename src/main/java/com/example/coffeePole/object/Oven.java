package com.example.coffeePole.object;

import com.example.coffeePole.object.menu.bread.Bread;
import com.example.coffeePole.object.menu.Menu;

public class Oven {
    private final Storage storage;

    public Oven(Storage storage) {
        this.storage = storage;
    }

    public Bread makeBread(Menu menu) throws Exception {
        if(storage.check(menu)) throw new Exception("빵이 소진 되었습니다.");
        return new Bread(menu.getName());
    }
}
