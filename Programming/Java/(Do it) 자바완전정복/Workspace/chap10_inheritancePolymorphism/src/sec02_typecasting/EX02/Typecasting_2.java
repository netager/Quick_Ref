package sec02_typecasting.EX02;

class A {
	int m = 3;
	void abc() {
		System.out.println("A 클래스");
	}
}

class B extends A {
	int n = 4;
	void bcd() {
		System.out.println("B 클래스");
	}
}

public class Typecasting_2 {
	public static void main(String[] args) {
		//#1. A 타입 / A 생성자
		A aa = new A();
		System.out.println(aa.m);
		aa.abc();
		System.out.println("-----------------------------");
		
		//#2. B타입 / B 생성자
		B bb = new B();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.bcd();
		System.out.println("-----------------------------");
		
		//#3. A 타입 / B 생성자
		A ab = new B();
		System.out.println(ab.m);
		ab.abc();
		System.out.println("-----------------------------");
		
		
	}
}
