package sec03_throwsexception.EX03;

//#1. 하위메서드에 직접 예외를 처리하는 경우
class A {
	
	void abc() {
		bcd();
	}
	
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");
			Thread.sleep(1000);	//일반예외 : InterruptedException
		} catch (InterruptedException | ClassNotFoundException e) {
			// 예외처리구문
		}	
	}
}

//#2. 예외를 호출 메서드로 전가하는 경우
class B {
	
	void abc() {
		try {
			bcd();
		} catch (InterruptedException | ClassNotFoundException e) {
			// 예외처리구문
		}	
	}
	
	void bcd() throws InterruptedException, ClassNotFoundException {
		Class cls = Class.forName("java.lang.Object");
		Thread.sleep(1000);
	}
}

public class ThrowsException_3 {

}
