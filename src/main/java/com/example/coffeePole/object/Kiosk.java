package com.example.coffeePole.object;

import com.example.coffeePole.object.menu.Menu;
import com.example.coffeePole.object.menu.MenuBoard;
import com.example.coffeePole.object.wallet.Money;

import java.util.ArrayList;

public class Kiosk {
    private int orderNum = 0;
    //메뉴 보여줘야함
    public ArrayList<Menu> showMenu(){
        for(Menu menu:MenuBoard.getInstance().showMenu()){
            System.out.println(menu.getName()+":"+menu.getPrice().getAmount());
        }
        return MenuBoard.getInstance().showMenu();
    }

    // ㄱㅏ격체크
    public boolean checkMoney(Menu menu, Money money){
        if(menu.getPrice().getAmount()< money.getAmount()) return false;
        else return true;
    }

    //계산ㅅㅣ discount policy 추가로 discount policyㅇㅔ 대한 해당사항이 있으면
    // 값을 추가해줘야함
    public Boolean calculate(Menu menu,Money money){
        if(menu.getPrice().getAmount()>money.getAmount()) return false;
        else return true;
    }

    public OrderNumber makeOrderNumber(){
        return new OrderNumber(orderNum+1);
    }
}
