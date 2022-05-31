package sec01_lambdaexpression.EX04;

interface A {
	void abc(int k);
}

public class RefOfInstanceMethod_Type1_2 {
	public static void main(String[] args) {
		
		//#1. 인스턴스 메서드 참조 type1 익명이너클래스
		A a1 = new A() {
			@Override
			public void abc(int k) {
				System.out.println(k);
			}	
		};
		
		//#2. 람다식
		A a2 = (int k) -> {System.out.println(k);};
		
		//#3. 인스턴스 참조 Type1의 표현
		A a3 = System.out::println;	//System.out - 객체명
		
		a1.abc(1);
		a2.abc(2);
		a3.abc(3);

		
	}

}
