package abstractex;

public abstract class Computer {

	public abstract void display(); //abstract - 메서드를 선언만 함. 메서드명 과 매개변수 알 수 있음
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원 On");
	}
	
	public void turnOff() {
		System.out.println("전원 Off");
	}
	
}