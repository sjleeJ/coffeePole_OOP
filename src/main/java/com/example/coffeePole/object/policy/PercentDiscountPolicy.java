package com.example.coffeePole.object.policy;

import com.example.coffeePole.object.menu.Menu;
import com.example.coffeePole.object.wallet.Money;

public class PercentDiscountPolicy implements DiscountPolicyStrategy{
    @Override
    public Money calcDiscountFee(Menu menu) {
        return null;
    }
}
