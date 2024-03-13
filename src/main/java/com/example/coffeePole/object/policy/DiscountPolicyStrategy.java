package com.example.coffeePole.object.policy;

import com.example.coffeePole.object.menu.Menu;
import com.example.coffeePole.object.wallet.Money;

// 할인정책
//
public interface DiscountPolicyStrategy {
    public Money calcDiscountFee(Menu menu);
}
