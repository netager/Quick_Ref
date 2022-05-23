package sec04_anonymousclass.EX01;

class A {
	
	C c = new B();
	
	void abc() {
		c.bcd();
	}

	class B implements C {	// C를 구현하기 위해 B 클래스를 사용
		@Override
		public void bcd() {
			System.out.println("인스턴스 이너클래스");
			
		}
	}

}

interface C {
	public abstract void bcd();
}


public class AnonymousClass_1 {
	public static void main(String[] args) {
		
		//#1. 객체 생성 및 메서드 호출
		A a = new A();
		a.abc(); // 인스턴스 이너클래스
	} //main 
}
