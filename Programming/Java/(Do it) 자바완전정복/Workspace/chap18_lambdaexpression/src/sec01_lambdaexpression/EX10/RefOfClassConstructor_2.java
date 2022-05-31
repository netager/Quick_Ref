package sec01_lambdaexpression.EX10;

interface A {
	B abc(int k);
}

class B {
	B() {
		System.out.println("첫번째 생성자");
	}
	
	B(int k) {
		System.out.println("두번째 생성자");
	}
}

public class RefOfClassConstructor_2 {
	public static void main(String[] args) {
		
		//# 클래스 생성자 참조
		//@1. 익명이너클래스
		A a1 = new A() {
			@Override
			public B abc(int k) {
				return new B(); 	//return new B(k); 둘간의 차이 
			}
		};
		
		//@2. 람다식
		A a2 = (int k)->{ return new B(k);};
		
		//@3. 배열의 생성자 참조
		A a3 = B::new;
		
		B b1 = a1.abc(3);
		B b2 = a2.abc(3);
		B b3 = a3.abc(3);
		
	}

}
