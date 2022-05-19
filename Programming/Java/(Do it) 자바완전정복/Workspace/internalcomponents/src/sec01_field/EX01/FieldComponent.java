package sec01_field.EX01;

// 필드와 지역변수우ㅢ 구분 //
//#1. 클래스를 생성 
class A {
	int m = 3; // 필드
	int n = 4; // 필드
	
	void work1() {
		int k = 5; // 지역변수
		System.out.println(k);  
		work2(3);
	}
	
	void work2(int i) { 	// "int i"가 먼저 실행되고 
		                    // "i=외부에서전달된 값" 실행 ---> 2개의 연산이 수행. i는 지역변수
		int j = 4; // 지역변수
		System.out.println(i+j); 
		
	}
	
} // class A

public class FieldComponent {

	public static void main(String[] args) {
		
		//#2. 클래스를 활용하여 객체 생성
		A a = new A();
		
		//#3-1. 필드값 출력
		System.out.println(a.m); // 3
		System.out.println(a.n); // 4
		
		//#3-2. 메서드 호출
		a.work1();

	} // main

} // class
