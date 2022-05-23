package sec04_anonymousclass.EX04;

interface A {
	public abstract void abc();
}


class C {
	void cde(A a) {
		a.abc();
	}
}


public class AnonymousClass_4 {
	public static void main(String[] args) {
		
		C c = new C();
		
		//#3. 방법#3. 클래스명(X) + 참조변수명(O)  
		A a = new A() {	
			@Override
			public void abc() {
				System.out.println("매개변수 전달");
			}
		};
		
		c.cde(a);	// 매개변수 전달
		
		//#4. 방법#4 클래스명(X) + 참조변수명(X)
		// 방법4 를 극단적으로 많이 사용 함.
		
		c.cde(new A() {	
			public void abc() {
				System.out.println("매개변수 전달");
			}
		});	// ";"을 문법적으로 빼야함.  
		
		
	}

}
