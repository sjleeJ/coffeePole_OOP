package com.example.coffeePole.object;

import com.example.coffeePole.object.menu.Beverage;
import com.example.coffeePole.object.menu.Coffee;
import com.example.coffeePole.object.menu.Menu;

public class Employee {
    private CoffeeMachine coffeeMachine;

    public Beverage makeCoffee(Menu menu) throws Exception {
        return coffeeMachine.makeCoffe(menu);
    }
}
