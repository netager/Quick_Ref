package sec02_typecasting.EX01;

//# 클래스의 상속관계
class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class Typecasting_1 {

	public static void main(String[] args) {

		//#1. 업캐스팅(자동변환) : 생략시 컴파일러가 자동 추가
		A ac = new C(); // C는 A이다. C ---> A 업캐스팅(자동변환)
						// 컴파이러가 변경 : A ac = (A) new C();
		B bc = new C(); // C는 B이다. C ---> B 업캐스팅(자동변환)
						// B bc = (B) new C();
		B bb = new B();
		A a = bb;		// A a = (A)bb; B ---> A 업캐스팅(자동변환)
		
		//#2-1. 다운 캐스팅(수동변환) : 캐스팅이 불가능한 경우(실행시 예외발생)
		A aa = new A();
//		B b = aa; 		// 오류발생, B b = (B)aa;로 변경하면 문법적 오류는 나지 않음.
		                // B b = (B) aa; 를 실행시키면 에러 발생 
//		C c = (C)aa;	// A ---> C 다운캐스팅(수동변환)
						// 문법적 오류는 안나지만 실행시 오류 발생.
		
		//#2-2. 다운캐스팅(수동변환) : 캐스팅이 가능한 경우 
		A ab = new B();
		B b = (B)ab; 	// A -> B 다운캐스팅(수동변환)
//		C c = ab; 		// A -> C 다운캐스팅(수동변환) : 불가능
		
		B bd = new D();
		D d = (D)bd; 	// B -> D 다운캐스팅(수동변환)
		
		A ad = new D();
		B b1 = (B)ad;	// A -> B 다운캐스팅(수동변환)
		D d1 = (D)ad; 	// A -> D 다운캐스팅(수동변환)
		
	}

}
