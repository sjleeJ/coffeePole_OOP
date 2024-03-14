package com.example.coffeePole.object;

import com.example.coffeePole.object.menu.bread.Bread;
import com.example.coffeePole.object.menu.coffee.Coffee;
import com.example.coffeePole.object.menu.Menu;

public class Employee {
    private CoffeeMachine coffeeMachine;
    private Oven oven;

    public Employee(CoffeeMachine coffeeMachine){
        this.coffeeMachine = coffeeMachine;
    }

    public Coffee makeCoffee(Menu menu) throws Exception {
        return coffeeMachine.makeCoffe(menu);
    }

    public Bread makeBread(Menu menu) throws Exception {
        return oven.makeBread(menu);
    }
}
