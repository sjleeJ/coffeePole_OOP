package com.example.coffeePole.object.staff;

import com.example.coffeePole.object.menu.Food;
import com.example.coffeePole.object.menu.Menu;
import com.example.coffeePole.object.menu.Recipe;
import com.example.coffeePole.object.menu.coffee.Coffee;

public class CoffeeStaff implements Recipe<Coffee>,Staff {
    private Coffee coffee;

    @Override
    public Food makeFood(Menu menu) {
        return new Coffee(menu.getName());
    }
}
