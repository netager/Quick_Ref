package sec04_boundedtype.EX02;

class A {
//	public <T> void method1(T t) {
//		System.out.println(t.charAt(0));	// 불가능 : charAt() 메서드는 String 메서드 임.
//	}
	
	public <T extends String> void method1(T t) {
		System.out.println(t.charAt(0));		// 가능 
	}
	
}

interface MyInterface {
	public abstract void print();
	
}

class B {
	public <T extends MyInterface> void method1(T t) {
		t.print();
	}
}


public class BoundedTypeOfGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.<String>method1("안녕");
		a.method1("안녕");
		
		B b = new B();
		b.method1(new MyInterface() {
			@Override
			public void print() {
				System.out.println("print() 구현");				
			}
		});
	}
}
