package sec03_constructor.EX02;

class A {
	A() {
		System.out.println("첫번째 생성자");
	}
	
	A(int a) {
		this();
		System.out.println("두번째 생성자");
	}
	
	A(int a, int b) {
		this(3);
		System.out.println("세번째 생성자");
	}
}


public class ConstructorOverloading {

	public static void main(String[] args) {
		
		// #1. 세가지 생성자를 이용한 객체 생성
		A a1 = new A();		// 첫번째 생성자
		System.out.println("-------------------------------");
		A a2 = new A(3);	// 두번째 생성자
		System.out.println("-------------------------------");
		A a3 = new A(3, 5); // 세번째 생성자 
		System.out.println("-------------------------------");
	}

}
