package sec01_instanceinnerclass.EX02;

class A {
	int a = 3;
	int b = 4;
	void abc() {
		System.out.println("A 클래스 메서드");
	}
	
	class B {
		int a = 5;
		int b = 6;
		void abc() {
			System.out.println("B 클래스 메서드");
		}
		
		void bcd() {
			//#1.
			System.out.println((a));	// 5       	    -  컴파일러가 자동으로 this를 붙여줌.
			System.out.println((b));	// 6			-  컴파일러가 자동으로 this를 붙여줌.
			abc();						// B 클래스 메서드	-  컴파일러가 자동으로 this를 붙여줌.
			
			//#2.
			System.out.println((A.this.a));	// 3       		-  outer 클래스 필드 사용
			System.out.println((A.this.b));	// 4			-  outer 클래스 필드 사용
			A.this.abc();					// A 클래스 메서드	-  outer 클래스 메서드 사용

		}
	}
}


public class UseMembersOfOuterClass {
	public static void main(String[] args) {
		
		//#1. outer class 객체 생성 
		A a = new A();
		A.B b = a.new B();	// 인스턴스 멤버 이너클래스 생성 
		
		//#2. 
		a.abc();	// A 클레스 메서드
		b.abc();	// B 클레스 메서드
		b.bcd();	// 5, 6, B 클레스 메서드
					// 3, 4, A 클레스 메서드
	}

}
