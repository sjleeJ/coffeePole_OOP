package com.example.coffeePole.object.menu;


import com.example.coffeePole.object.wallet.Money;

import java.util.ArrayList;

public class MenuBoard {
    //싱글톤으로 하나만 있어도 될듯.
    //메뉴판 보여주기
    private static MenuBoard instance;
    private ArrayList<Menu> foods = new ArrayList<Menu>();

    private MenuBoard(){
        Menu esspresso = new Menu("coffee","에스프레소",new Money(2500));
        Menu americano = new Menu("coffee","아메리카노",new Money(3000));
        Menu caffeLatte = new Menu("coffee","카페라떼",new Money(3500));

        Menu bread = new Menu("bread","햄 샌드위치",new Money(6000));

        foods.add(esspresso);
        foods.add(americano);
        foods.add(caffeLatte);
        foods.add(bread);
    }

    public static MenuBoard getInstance(){
        if(instance == null){
            instance = new MenuBoard();
        }
        return instance;
    }
    public ArrayList<Menu> showMenu(){
        return foods;
    }

}
