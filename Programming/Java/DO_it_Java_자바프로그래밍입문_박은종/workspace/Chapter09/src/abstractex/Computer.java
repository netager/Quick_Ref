package abstractex;

public abstract class Computer {

	public abstract void display(); //abstract - �޼��带 ���� ��. �޼���� �� �Ű����� �� �� ����
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("���� On");
	}
	
	public void turnOff() {
		System.out.println("���� Off");
	}
	
}