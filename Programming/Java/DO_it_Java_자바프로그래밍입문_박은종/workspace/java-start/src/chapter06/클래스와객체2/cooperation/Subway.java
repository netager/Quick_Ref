package chapter06.클래스와객체2.cooperation;

public class Subway {
	int lineNumber;
	int passengerCounter;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
		
	}
	
	public void take(int money) {
		this.money += money;
		passengerCounter++;

	}
	
	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "번의 승객은 " + passengerCounter + "명이고, 수입은 " + money + "입니다 ." );
	}

}
