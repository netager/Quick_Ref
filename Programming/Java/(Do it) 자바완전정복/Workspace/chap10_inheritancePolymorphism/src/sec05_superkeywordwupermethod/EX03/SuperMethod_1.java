package sec05_superkeywordwupermethod.EX03;

class A {
	A() {
		System.out.println("A 생성자");
	}
}

class B extends A {
	B() {
		// super() 생략시 자동으로 컴파일러가 super() 생성
		System.out.println("B 생성자");
	}
}

class C {
	C(int a) {
		System.out.println("C 생성자");
	}
}

class D extends C {
	
	// 컴파일러가 생성하는 코드
	// D() {
	// 		super();	// super의 생성자(C())가 없음. 에러 발생
	// }
	//
	// 에러를 없애기 위해 아래 코드를 사용자가 추가
	D() {
		super(3);
	}
	
}

public class SuperMethod_1 {
	public static void main(String[] args) {
	
		//#1. A 객체 생성
		A aa = new A();	// A 생성자
		System.out.println("-------------------");
		
		//#2. B 객체 생성
		B bb = new B(); // A 생성자
						// B 생성자
		System.out.println("-------------------");
				
	}
}
