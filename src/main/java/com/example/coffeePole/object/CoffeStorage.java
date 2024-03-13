package com.example.coffeePole.object;

import com.example.coffeePole.object.menu.Menu;

public class CoffeStorage implements Storage{

    private int americanoCnt = 1;
    private int caffeLatteCnt = 1;
    private int espressoCnt = 1;
    @Override
    public boolean check(Menu menu) {
        switch (menu.getName()){
            case "아메리카노": americanoCnt--;
                            return true;
            case "카페라떼": caffeLatteCnt--;
                            return true;
            case "에스프레소": espressoCnt--;
                            return true;
            default: return false;
        }

    }
}
