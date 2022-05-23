package sec04_overlapmember.EX03;

class A {
	static void print() {
		System.out.println("A 클래스");
	}
}

class B extends A {
	static void print() {
		System.out.println("B 클래스");
	}
}


public class OverlapStaticMethod {
	public static void main(String[] args) {
		
		//#1. 클래스 이름으로 바로 접근 
		A.print();
		B.print();
		System.out.println("-----------------------------");
		
		//#2. 객체를 생성
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		aa.print();		// A 클래스
		bb.print();		// B 클래스
		ab.print();		// A 클래스 
		System.out.println("-----------------------------");
		
	}
}
