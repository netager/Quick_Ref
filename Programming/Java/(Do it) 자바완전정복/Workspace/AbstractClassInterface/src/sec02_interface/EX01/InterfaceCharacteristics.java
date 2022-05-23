package sec02_interface.EX01;

interface A {
	// 모든 필드는 public static final 로 정의 해야 함.
	public static final int a = 3;
	
	// 모든 메서드는 public abstract로 정의 해야 함.
	public abstract void abc();
}

interface B {
	int b = 3;	// compiler가 public static final int b = 3;으로 변경 해 줌.
	void bcd(); // compiler가 public abstract void bcd();로 변경 해 줌.
}

public class InterfaceCharacteristics {
	public static void main(String[] args) {
		
		//#1. static 자동추가 체크
		System.out.println(A.a);
		System.out.println(B.b);
		
		//#2. final 자동추가 체크 
//		A.a =  5;	// 오류 발생
//		B.b = 5;	// 오류 발생
		
	}
}
