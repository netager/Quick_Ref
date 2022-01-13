package cooperation3;

public class Bus {
	
	int busNumber;
	int money;
	int passengerCount;
	
	public Bus() {}
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(busNumber + "������ ���� �ݾ��� " + money + "�̸�, �°����� "
				+ passengerCount + "�Դϴ�.");
	}
}
