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
		System.out.println(busNumber + "버스의 현재 금액은 " + money + "이며, 승객수는 "
				+ passengerCount + "입니다.");
	}
}
