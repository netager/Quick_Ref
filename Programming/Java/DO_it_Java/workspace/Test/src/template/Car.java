package template;

public abstract class Car {
	
	public abstract void drive();
	
	public abstract void stop();
	
	public abstract void wiper();
	
	// �ʿ信 ���ؼ� �������Ͽ� ����ϵ��� �ϴ� �޼���
	// ���� �ڵ尡 ������ ���� Ŭ�������� �������Ͽ� ��� ����
	public void washCar() {};
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
		
	}
	
	// � �ڵ��� ���� ���� �Ʒ��� ������ ����
	// ���ø� �޼��� - final
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}

}
