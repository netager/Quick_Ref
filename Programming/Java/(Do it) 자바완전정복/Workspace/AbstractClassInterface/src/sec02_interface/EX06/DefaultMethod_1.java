package sec02_interface.EX06;

interface A {
	void abc();	// 2020년 생성
//	void bcd(); // 2030년 생성 - class B 에서 오류 발생. 이런 문제 해결을 위해 default 메서드 기능 추가(Ver1.8이후)
	default void bcd() {	// 기존에 사용하던 클래스 B 에서 오류 발생하지 않음
							// 구현 클래스에서 Overriding도 가능함.
		System.out.println("A 인터페이스의 bcd()");
	}
}

class B implements A {	//2020년 생성
	@Override
	public void abc() {
		System.out.println("B 클래스의 abc()");
	}
}

class C implements A {
	@Override
	public void abc() {
		System.out.println("C 클래스의 abc()");
		
	}
	
	@Override
	public void bcd() {
		System.out.println("C 클래스의 bcd()");	}
}

public class DefaultMethod_1 {
	public static void main(String[] args) {
		
		//#1. 객체 생성
		A a1 = new B();
		A a2 = new C();
		
		//#2. 메서드 호출
		a1.abc();	// B 클래스의 abc()
		a1.bcd();	// A 인터페이스의 bcd()
		System.out.println("----------------------------");

		a2.abc();	// C 클래스의 abc()
		a2.bcd();	// C 클래스의 bcd()
		System.out.println("----------------------------");

	}
}
