package sec01_finalmodifier.EX01;

// final 은 최초 선언된 이후 값을 대입할 수 없다.
// final 필드는 선언하면서 초기화 하던지 생성하면서 생성자에서 초기화 해야 한다. 그 이후에 생성하면 오류 발생.
class A1 {
	int a = 3;
	final int b = 5;
	
	A1() { 
	
	}
}

class A2 {
	int a;
	final int b;
	
	A2() { 
		a = 3;
		b = 5;
	
	}
}

class A3 {
	int a = 3;
	final int b = 5;
	
	A3() { 
		a = 5;
//		b = 5;	// 오류 발생. final 필드는 한번 정해진 값을 바꿀수 없다. (최초 선언된 이후 값을 대입할 수 없다)
	
	}
}

class B {
	void bcd() {
		int a = 3;
		final int b = 5;	// 지역변수
		
		a = 5;
//		b = 5;	// 오류 발생. final 변수이므로 오류
		
	}
}


public class finalmodifier_1 {
	public static void main(String[] args) {
		
		//#1. 객체 생성 
		A1 a1 = new A1();
		a1.a = 7;
//		a1.b = 9;	// 오류 발생. final 필드는 한번 정해진 값을 바꿀수 없다.

		//#1. 객체 생성 
		A2 a2 = new A2();
		a2.a = 7;
//		a2.b = 9;	// 오류 발생. final 필드는 한번 정해진 값을 바꿀수 없다.

	}
}
