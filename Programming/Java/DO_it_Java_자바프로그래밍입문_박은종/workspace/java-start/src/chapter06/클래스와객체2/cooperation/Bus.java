package chapter06.Ŭ�����Ͱ�ü2.cooperation;

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
		System.out.println("���� " + busNumber + "���� �°��� " + passengerCounter + "���̰�, ������ " + money + "�Դϴ� ." );
	}
	
	
}
