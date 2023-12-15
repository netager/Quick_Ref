package chapter06.클래스와객체2.cooperation;

public class Bus {

	int busNumber;
	int passengerCounter;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		
	}
	
	public void take(int money) {
		this.money += money;
		passengerCounter++;

	}
	
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCounter + "명이고, 수입은 " + money + "입니다 ." );
	}
	
	
}
