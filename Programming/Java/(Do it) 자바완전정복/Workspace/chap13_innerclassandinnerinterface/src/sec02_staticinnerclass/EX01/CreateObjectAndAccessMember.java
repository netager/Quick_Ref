package sec02_staticinnerclass.EX01;

class A {
	int a = 3;
	static int b = 4;
	
	void method1() {
		System.out.println("instance method");
	}
	
	static void method2() {
		System.out.println("static method");
	}
	
	// static class 는 static 필드만 사용 가능 
	static class B {
		void bcd() {
			//#1. 
//			System.out.println(a); 	// static 은 static만 포함 가능
			System.out.println(b);
			
			//#2. 메서드 호출
//			method1();				// static 은 static만 포함 가능
			method2();
		}
	}
}


public class CreateObjectAndAccessMember {
	public static void main(String[] args) {
		
		//#1. static inner class의 객체 생성 
		A.B b = new A.B();	// static 클래스 이기때문에 외부에서 보이기떄문에 객체 생성 가능
						// static class 가 아니면 먼저 외부 클래스 객체를 생성해야 하기 때문에
						// A a = new A(); - 먼저 외부 걖체를 생성한 후
						// A.B b = a.new B();로 이너클래스를 생성한다.
	}

}
