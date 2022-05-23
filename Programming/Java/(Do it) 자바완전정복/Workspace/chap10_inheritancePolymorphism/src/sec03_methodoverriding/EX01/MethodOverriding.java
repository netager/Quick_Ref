package sec03_methodoverriding.EX01;

class A {
	void print() {
		System.out.println("A 클래스");
		
	}
}

class B extends A {
	@Override
	void print() {
		System.out.println("B 클래스");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		
		//#1. A 타입 / A 생성자
		A aa = new A(); 
		aa.print(); 	// A 클래스
		
		//#2. B 타입 / B 생성자
		B bb = new B();
		bb.print(); 	// B 클래스 
		
		//#3. A 타입 / B 생성자
		A ab = new B();
		ab.print(); 	// B클래스 
		
//		B ba = new A();	// 오류 
		
		
		
	}
}
