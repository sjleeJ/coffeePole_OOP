package com.example.coffeePole.object.staff;

import com.example.coffeePole.object.menu.Food;
import com.example.coffeePole.object.menu.Menu;
import com.example.coffeePole.object.menu.Recipe;
import com.example.coffeePole.object.menu.bread.Bread;

public class BreadStaff implements Recipe<Bread>,Staff {
    @Override
    public Food makeFood(Menu menu) {
        return new Bread(menu.getName());
    }
}
