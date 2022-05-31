package sec01_lambdaexpression.EX01;

interface A {
	void abc();
}

class B implements A {
	@Override
	public void abc() {
		System.out.println("메서드 내용");
		
	}
}


public class OOPvsFP {
	public static void main(String[] args) {
		
		//#1. 객체지향 프로그래밍 문법 1 (case1)
		A a1 = new B();
		a1.abc();
		
		//#2. 객체지향 프로그래밍 문법 2 (case2) : 익명이너클래스 사용
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("익명 이너클래스 메서드 내용");
				
			}
		};
		a2.abc();
		
		//#3-1. 함수적 프로그래밍 문법 (람다식) (case3)
		A a3 = ()->{System.out.println("람다식1 메서드 내용");};
		a3.abc();
		
		//#3-2. 함수적 프로그래밍 문법 (람다식) (case3)
		A a4 = ()-> System.out.println("람다식2 메서드 내용");
		a4.abc();

	}
}
