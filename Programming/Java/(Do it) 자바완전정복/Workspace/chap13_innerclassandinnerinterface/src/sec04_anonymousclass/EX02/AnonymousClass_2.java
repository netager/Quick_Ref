package sec04_anonymousclass.EX02;

class A {
	
	C c = new C() {
		public void bcd() {
			System.out.println("인스턴스 이너클래스");
		}
	};
	
	void abc() {
		c.bcd();
	}

}

interface C {
	public abstract void bcd();
}


public class AnonymousClass_2 {
	public static void main(String[] args) {
		//#1. 객체 생성 및 메서드 호출
		A a = new A();
		a.abc(); // 인스턴스 이너클래스
		
	}

}
