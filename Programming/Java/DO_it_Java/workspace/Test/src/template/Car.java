package template;

public abstract class Car {
	
	public abstract void drive();
	
	public abstract void stop();
	
	public abstract void wiper();
	
	// 필요에 의해서 재정의하여 사용하도록 하는 메서드
	// 구현 코드가 없지만 하위 클래스에서 재정의하여 사용 가능
	public void washCar() {};
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
		
	}
	
	// 어떤 자동차 든지 간에 아래의 순서는 동일
	// 템플릿 메서드 - final
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}

}
