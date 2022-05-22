package sec04_overlapmember.EX02;

class A {
	static int m = 3;
	
}

class B extends A {
	static int m = 4;
}


public class OverlapsStaticField {
	public static void main(String[] args) {
		

		//#1. 클래스 이름으로 바로 접근
		System.out.println(A.m);
		System.out.println(B.m);
		System.out.println("----------------------------");
		
		// #2. 객체 생성
		A aa = new A();
		B bb = new B();
		A ab = new B();
	
		// #2. 인스턴스 필드
		System.out.println(aa.m); // 3
		System.out.println(bb.m); // 4
		System.out.println(ab.m); // 3
		System.out.println("----------------------------");
	}

}
