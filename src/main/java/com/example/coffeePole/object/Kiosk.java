package com.example.coffeePole.object;

import com.example.coffeePole.object.menu.Menu;
import com.example.coffeePole.object.menu.MenuBoard;
import com.example.coffeePole.object.wallet.Money;

import java.util.ArrayList;

public class Kiosk {
    //메뉴 보여줘야함
    public ArrayList<Menu> showMenu(){
        for(Menu menu:MenuBoard.getInstance().showMenu()){
            System.out.println(menu.getName()+":"+menu.getPrice());
        }
        return MenuBoard.getInstance().showMenu();
    }

    // ㄱㅏ격체크
    public boolean checkMoney(Menu menu, Money money){
        if(menu.getPrice().getAmount()< money.getAmount()) return false;
        else return true;
    }

    //계산
    public Boolean calculate(Menu menu,Money money){
        if(menu.getPrice().getAmount()>money.getAmount()) return false;
        else return true;
    }
}
