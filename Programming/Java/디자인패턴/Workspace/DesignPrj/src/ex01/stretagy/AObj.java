package ex01.stretagy;

public class AObj {
	
	Ainterface ainterface;

	public AObj() {
		
		ainterface = new AinterfaceImpl();

	}
	public void funcAA() {
		ainterface.funcA();
		ainterface.funcA();
		
		// ~ ����� �ʿ���. ���������.
	}
}
