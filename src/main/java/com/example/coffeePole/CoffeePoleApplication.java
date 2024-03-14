package com.example.coffeePole;


import com.example.coffeePole.object.*;
import com.example.coffeePole.object.menu.Food;
import com.example.coffeePole.object.menu.Menu;
import com.example.coffeePole.object.staff.BreadStaff;
import com.example.coffeePole.object.staff.CoffeeStaff;
import com.example.coffeePole.object.staff.Staff;
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
		Staff coffeeStaff = new CoffeeStaff();
		Staff breadStaff = new BreadStaff();

		NoticeBoard noticeBoard = new NoticeBoard();
		Menu chooseMenu = new Menu("bread","빵",new Money(6000));
		//금액확인
		if(guest.checkMenu(chooseMenu)){
			System.out.println("주문 가능 합니다.");
			//돈을 낸다.
			Safe.getInstance().saveMoney(chooseMenu);
			wallet.minusMoney(chooseMenu);
			//주문번호를 생성한다
			OrderNumber orderNum = kiosk.makeOrderNumber();
			System.out.println("주문번호는 "+orderNum.getNumber()+"번 입니다.");
			Food food = null;
			switch (chooseMenu.getCategory()){
				case "coffee": food = coffeeStaff.makeFood(chooseMenu);
				case "bread": food = breadStaff.makeFood(chooseMenu);
			}



			if(food!=null){
				noticeBoard.ShowOrderMenu(orderNum,food);
				System.out.println("손님 지갑 잔액:"+wallet.getMoney());
				System.out.println("금고 잔액:"+Safe.getInstance().calculateMoney());
			} else {
				System.out.println("잘못 주문 하셨습니다.");
			}


		}else{
			System.out.println("주문 불가능");
		}


	}
}
