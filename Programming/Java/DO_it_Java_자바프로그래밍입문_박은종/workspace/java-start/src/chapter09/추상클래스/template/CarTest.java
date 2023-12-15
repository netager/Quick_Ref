package chapter09.추상클래스.template;

public class CarTest {
	public static void main(String[] args) {
		
		Car myCar = new ManualCar();
		myCar.run();
		
		Car yourCar = new AICar();
		yourCar.run();
		
	}

}
