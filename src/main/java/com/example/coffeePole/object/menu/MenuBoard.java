package com.example.coffeePole.object.menu;


import com.example.coffeePole.object.wallet.Money;

import java.util.ArrayList;

public class MenuBoard {
    //싱글톤으로 하나만 있어도 될듯.
    //메뉴판 보여주기
    private static MenuBoard instance;
    private ArrayList<Menu> beverages = new ArrayList<Menu>();

    private MenuBoard(){
        Menu esspresso = new Menu("에스프레소",new Money(2500));
        Menu americano = new Menu("아메리카노",new Money(3000));
        Menu caffeLatte = new Menu("카페라떼",new Money(3500));

        beverages.add(esspresso);
        beverages.add(americano);
        beverages.add(caffeLatte);
    }

    public static MenuBoard getInstance(){
        if(instance == null){
            instance = new MenuBoard();
        }
        return instance;
    }
    public ArrayList<Menu> showMenu(){
        return beverages;
    }

}
