package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	public void washCar() {}  // �ʿ信 ���� ������ �Ͽ� ����ϵ��� �� �� ����
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}

	final public void run() { // ���ø� �޼��� 
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
