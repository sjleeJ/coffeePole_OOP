package com.example.coffeePole;


import com.example.coffeePole.object.*;
import com.example.coffeePole.object.menu.Food;
import com.example.coffeePole.object.menu.Menu;
import com.example.coffeePole.object.wallet.Money;
import com.example.coffeePole.object.wallet.Wallet;

public class CoffeePoleApplication {

	public static void main(String[] args) throws Exception {
		Wallet wallet =  new Wallet(new Money(7000));
		Guest guest = new Guest(wallet);
		CoffeeMachine coffeeMachine = new CoffeeMachine(new CoffeStorage());
		Employee employee = new Employee(coffeeMachine);
		Kiosk kiosk = new Kiosk();
		kiosk.showMenu();

		NoticeBoard noticeBoard = new NoticeBoard();
		Menu chooseMenu = new Menu("아메리카노",new Money(3000));
		//금액확인
		if(guest.checkMenu(chooseMenu)){
			System.out.println("주문 가능 합니다.");
			//돈을 낸다.
			Safe.getInstance().saveMoney(chooseMenu);
			wallet.minusMoney(chooseMenu);
			//주문번호를 생성한다
			OrderNumber orderNum = kiosk.makeOrderNumber();
			System.out.println("주문번호는 "+orderNum.getNumber()+"번 입니다.");
			//음식을 만든다.
			Food food = employee.makeCoffee(chooseMenu);

			//음식을 알람번호와 같이 알림판에게 준다.
			noticeBoard.ShowOrderMenu(orderNum,food);

			System.out.println("손님 지갑 잔액:"+wallet.getMoney());
			System.out.println("금고 잔액:"+Safe.getInstance().calculateMoney());

		}else{
			System.out.println("주문 불가능");
		}


	}
}
