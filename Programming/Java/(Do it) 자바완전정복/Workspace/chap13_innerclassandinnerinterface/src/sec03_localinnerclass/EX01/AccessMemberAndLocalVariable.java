package sec03_localinnerclass.EX01;

class A {
	int a = 3;		// 필드
	
	void abc() {
		int b = 5; 	// 지역변수 - 컴파일러가 "final int b = 5"로 자동 변경함.
		
		// 지역 이너클래스
		class B {	
			void bcd() {
				System.out.println(a);	// 필드
				System.out.println(b);	// 지역변수
				a = 5;
//				b = 7;	// b는 실제적으로 final로 정의된 변수 - 컴파일러가 "final int b = 5"로 변경 함.
				
			}
		}
		
		B bb = new B();
		bb.bcd();
	}
}

public class AccessMemberAndLocalVariable {
	public static void main(String[] args) {
		
		//#1. 객체 생성 및 메서드 호출
		A a = new A();
		a.abc();	// 3, 5
	}
}
