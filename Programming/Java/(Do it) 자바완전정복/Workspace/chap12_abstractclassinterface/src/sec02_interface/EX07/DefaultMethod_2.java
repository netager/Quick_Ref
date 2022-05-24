package sec02_interface.EX07;

interface A {
	default void abc() {
		System.out.println("A 인터페이스의 abc()");
	}
}

class B implements A {
	@Override
	public void abc() {
		A.super.abc();	// 보모 인터페이스의 메서드 호출 (인터페이스명.super.메서드())
						// super.abc()로 사용하면 부모 클래스의 abc()를 호출하라는 말임. B의 부모 클래스는 Object 임.
						// 따라서, Object.abc()를 호출하게 되므로 오류가 발생함.
		System.out.println("B 클래스의 abc()");
	}
}

public class DefaultMethod_2 {
	public static void main(String[] args) {
		
		//#1. 객체 생성
		B b = new B();
		
		
		//#2. 메서드 호출
		b.abc(); 	// A 인터페이스의 abc()
					// B 클래스의 abc()
		
	}
}
