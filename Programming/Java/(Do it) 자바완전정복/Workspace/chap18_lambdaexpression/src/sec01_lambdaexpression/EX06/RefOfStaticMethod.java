package sec01_lambdaexpression.EX06;

interface A {
	void abc(B b, int k);
}

class B {
	void bcd(int k) {
		System.out.println(k);
	}
}


public class RefOfStaticMethod {
	public static void main(String[] args) {
		
		//#인스턴스 메서드 참조 Type2
		//@1 익명이너클래스
		A a1 = new A() {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		
		//@2. 람다식
		A a2 = (B b, int k) -> {b.bcd(k);};
		
		//@3. 인스턴스 메서드 참조 Type2
		A a3 = B::bcd;
	
		B b = new B();
		a1.abc(b, 1);
		a2.abc(b, 2);
		a3.abc(b, 3);
	}
}
