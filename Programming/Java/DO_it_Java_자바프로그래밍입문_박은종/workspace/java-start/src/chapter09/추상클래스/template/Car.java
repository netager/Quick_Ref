package chapter09.�߻�Ŭ����.template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	public void washCar() {}
	
	public void startCar() {
		System.out.println("�õ��� �̴ϴ�.");
	}

	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	
	
	// �Ϸ��� ������ ���س��� �޼��� - �����ӿ�ũ���� ���� �����.
	// Template Method
	final public void run() {  // �ٲ�� �ȵǴ� �޼��� - final - template method
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}

}
