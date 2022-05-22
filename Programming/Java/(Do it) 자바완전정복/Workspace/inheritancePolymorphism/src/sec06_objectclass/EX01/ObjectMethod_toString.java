package sec06_objectclass.EX01;

class A {	// extends Object (컴파일러에 의해서 자동추가)
	int a = 3;
	int b = 4;
}

class B {
	int a = 3;
	int b = 4;
	
	@Override
	public String toString() {
		return "필드값(a,b) = " + a + " " + b;
	}
}


public class ObjectMethod_toString {
	public static void main(String[] args) {
		
		//#1. 객체 생성 
		A a = new A();
		B b = new B();
		
		//#2. 메서드 호출
		System.out.printf("%d\n", a.hashCode()); // hashcode를 10진수로 표현
		System.out.printf("%x\n", a.hashCode()); // hashcode를 16진수로 표현
		System.out.println(a);  // a 객체의 정보 : package.class_nam@hashcode
								// a.toString() 과 동일
								// toString() 메서드는 생략시 자동 추가
		System.out.println(a.toString());
		System.out.println("-------------------------------------");
		
		System.out.println(b);
		
		

	}
}
