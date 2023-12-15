package chapter09.추상클래스.template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	public void washCar() {}
	
	public void startCar() {
		System.out.println("시동을 겁니다.");
	}

	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	
	
	// 일련의 과정을 정해놓은 메서드 - 프레임워크에서 많이 사용함.
	// Template Method
	final public void run() {  // 바뀌면 안되는 메서드 - final - template method
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}

}
