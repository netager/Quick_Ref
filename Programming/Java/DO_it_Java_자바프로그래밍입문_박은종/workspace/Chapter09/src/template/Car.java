package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	public void washCar() {}  // 필요에 따라서 재정의 하여 사용하도록 할 수 있음
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}

	final public void run() { // 템플릿 메서드 
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
