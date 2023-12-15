package chapter09.추상클래스.template;

public class AICar extends Car {

	@Override
	public void drive() {

		System.out.println("AI가 운전합니다.");
		System.out.println("AI가 핸들을 조작합니다.");
		
	}

	@Override
	public void stop() {

		System.out.println("AI가 브레이크 브레이크로 정지합니다.");
		
	}

	@Override
	public void wiper() {

		System.out.println("AI가 Wiper를 작동시킵니다.");
		
	}

}
