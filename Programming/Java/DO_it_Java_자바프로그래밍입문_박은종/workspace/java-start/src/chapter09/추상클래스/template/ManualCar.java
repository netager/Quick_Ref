package chapter09.�߻�Ŭ����.template;

public class ManualCar extends Car {

	@Override
	public void drive() {

		System.out.println("����� �����մϴ�.");
		System.out.println("����� �ڵ��� �����մϴ�.");
		
	}

	@Override
	public void stop() {

		System.out.println("����� �극��ũ �극��ũ�� �����մϴ�.");
		
	}

	@Override
	public void wiper() {

		System.out.println("����� Wiper�� �۵���ŵ�ϴ�.");
		
	}

	@Override
	public void washCar() {

		System.out.println("����� ������ �մϴ�.");

		super.washCar();
	}
	
}
