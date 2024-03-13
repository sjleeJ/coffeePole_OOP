package com.example.coffeePole.object;

import com.example.coffeePole.object.menu.Food;

public class NoticeBoard {
    public void ShowOrderMenu(OrderNumber orderNumber, Food food){
        System.out.println("주문번호 "+orderNumber.getNumber()+"번 손님 주문하신 음식 "+food.getName()+"나왔습니다.");
    }

}
