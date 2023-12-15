package ex11.decoratorpattern;

import java.util.Scanner;

import ex11.decoratorpattern.abst.IBeverage;
import ex11.decoratorpattern.concreate.Base;
import ex11.decoratorpattern.concreate.Espresso;
import ex11.decoratorpattern.concreate.Milk;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		IBeverage beverage = new Base();
		boolean done = false;
		
		while(!done) {
			System.out.println("음료 현재 가격 : "+ beverage.getTotalPrice());
			System.out.println("선택 : 0: 선택완료 / 1:샷 추가 / 2:우유 추가");
			switch(sc.nextInt()) {
				case 0: done = true;
					break;
				case 1: 
					beverage = new Espresso(beverage);
					break;
				case 2:
					beverage = new Milk(beverage);
					break;
			
			}
			
		}
		
		System.out.println("음료 가격 : "+beverage.getTotalPrice());
		sc.close();

	}

}
