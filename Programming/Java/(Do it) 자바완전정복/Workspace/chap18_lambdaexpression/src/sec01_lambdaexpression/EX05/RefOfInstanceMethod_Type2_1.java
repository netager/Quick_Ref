package sec01_lambdaexpression.EX05;

interface A {
	void abc();
}

class B {
	static void bcd() {
		System.out.println("static 메서드");
	}
}

public class RefOfInstanceMethod_Type2_1 {
	public static void main(String[] args) {
		
		A a1 = new A() {
			@Override
			public void abc() {
				B.bcd();
			}
		};
		
		//@2. 람다식
		A a2 = () -> {B.bcd();};
		
		//@3. 정적메서드 참조
		A a3 = B::bcd;
	
		a1.abc();
		a2.abc();
		a3.abc();
	}
}
