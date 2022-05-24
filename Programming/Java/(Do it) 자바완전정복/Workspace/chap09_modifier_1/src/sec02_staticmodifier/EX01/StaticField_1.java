package sec02_staticmodifier.EX01;

class A {
	int m = 3; 			// 인스턴스 필드
	static int n = 5; 	// 정적(static) 필드
}

public class StaticField_1 {

	public static void main(String[] args) {

		//#1. 인스턴스 필드 활용방법(항상 객체 생성을 한 후 사용 가능)
		A a = new A();
		System.out.println(a.m);

		//#2. 정적(static) 필드 활용 방법
		//@ 방법#1 (객체 생성없이 클래스 이름으로 바로 활용)
		System.out.println(A.n);
		
		//@ 방법#1 (객체 생성후 활용 : 인스턴스와 동일)
		System.out.println(a.n);
		
	}

}
