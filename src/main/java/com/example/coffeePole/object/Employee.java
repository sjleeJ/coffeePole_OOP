package com.example.coffeePole.object;

import com.example.coffeePole.object.menu.Bread;
import com.example.coffeePole.object.menu.Menu;
import com.example.coffeePole.object.menu.Food;

public class Employee {
    private CoffeeMachine coffeeMachine;
    private Oven oven;

    public Employee(CoffeeMachine coffeeMachine){
        this.coffeeMachine = coffeeMachine;
    }

    public Food makeCoffee(Menu menu) throws Exception {
        return coffeeMachine.makeCoffe(menu);
    }

    public Bread makeBread(Menu menu) throws Exception {
        return oven.makeBread(menu);
    }
}
