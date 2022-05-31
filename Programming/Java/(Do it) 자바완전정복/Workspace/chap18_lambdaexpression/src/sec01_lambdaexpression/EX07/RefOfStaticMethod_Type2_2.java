package sec01_lambdaexpression.EX07;

interface A {
	int abc(String str);
}

interface B {
	int abc(String str, int k);
}


public class RefOfStaticMethod_Type2_2 {
	public static void main(String[] args) {
		
		//# 인스턴스 메서드 참조 Type2
		//@1. 익명이너클래스
		A a1 = new A() {
			@Override
			public int abc(String str) {
				return str.length();
			}
		};
		System.out.println(a1.abc("가나다"));
		
		//@2. 람다식 
		A a2 = (String str) -> {return str.length();};
		System.out.println(a2.abc("JB금융지주"));
		
		//@3. 인스턴스 메서드 참조 Type2
		A a3 = String::length;
		System.out.println(a3.abc("금융지주"));
		

		//# 인스턴스 메서드 참조 Type2
		//@1. 익명이너클래스
		B b1 = new B() {
			@Override
			public int abc(String str, int k) {
				return str.charAt(k);
			}
		};
		System.out.println(b1.abc("가나다", 1));
		
		//@2. 람다식 
		B b2 = (String str, int k) -> {return str.charAt(k);};
		System.out.println(b2.abc("JB금융지주", 2));
		
		//@3. 인스턴스 메서드 참조 Type2
		B b3 = String::charAt;
		System.out.println(b3.abc("금융지주", 3));

	}
}
