package cooperation4;

public class Bus extends Trans{
	
	int busNumber;
	
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
