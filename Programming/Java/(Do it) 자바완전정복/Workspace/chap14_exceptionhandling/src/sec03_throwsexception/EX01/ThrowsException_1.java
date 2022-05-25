package sec03_throwsexception.EX01;

<<<<<<< HEAD
//#1. 하위메서드에 직접 예외를 처리하는 경우
class A {
	
	void abc() {
		bcd();
	}
	
	void bcd() {
		try {
			Thread.sleep(1000);	//일반예외 : InterruptedException
		} catch (InterruptedException e) {
			// 예외처리구문
		}	
	}
}

//#2. 예외를 호출 메서드로 전가하는 경우
class B {
	
	void abc() {
		try {
			bcd();
		} catch (InterruptedException e) {
			// 예외처리구문
		}	
	}
	
	void bcd() throws InterruptedException {
		Thread.sleep(1000);
	}
}

=======
//#1. 하위메서드에 직접 예외를 처리하는 방법
class A {
	
	void bcd() {
		Thread.sleep(1000));
	}
}
>>>>>>> 1e91c2a2ccb799eff5f976ad0ef559033ef89fef
public class ThrowsException_1 {

}
