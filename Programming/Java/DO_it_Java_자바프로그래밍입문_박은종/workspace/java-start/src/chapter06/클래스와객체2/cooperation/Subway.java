package chapter06.Ŭ�����Ͱ�ü2.cooperation;

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
		System.out.println("����ö " + lineNumber + "���� �°��� " + passengerCounter + "���̰�, ������ " + money + "�Դϴ� ." );
	}

}
