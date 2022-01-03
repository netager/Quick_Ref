package abstractex;

public abstract class Computer {
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("On");
	}
	
	public void turnOff() {
		System.out.println("Off");
	}
	
}