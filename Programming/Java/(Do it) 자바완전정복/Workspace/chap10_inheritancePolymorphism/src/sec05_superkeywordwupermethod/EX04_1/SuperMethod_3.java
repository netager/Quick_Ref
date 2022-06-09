package sec05_superkeywordwupermethod.EX04_1;

class A {
	A() {
		this(3);
		System.out.println("A 생성자1");
	}

	A(int a) {
		System.out.println("A 생성자2");
	}

}

class B extends A {
	B() {
		this(3);
		System.out.println("B 생성자1");
	} 

	B(int a) {
		System.out.println("B 생성자2");
	}

}
public class SuperMethod_3 {
	public static void main(String[] args) {
		
		// #1. A 객체 생성	
		A aa1 = new A();	// A 생성자2
							// A 생성자1
		System.out.println("-----------------------");
		
		A aa2 = new A(3);	// A 생성자2
		System.out.println("-----------------------");
		
		// #2. B 객체 생성	
		B bb1 = new B();	// A 생성자2
							// A 생성자1
							// B 생성자2
							// B 생성자1
		System.out.println("-----------------------");
		B bb2 = new B(3);	// A 생성자2
							// A 생성자1
							// B 생성자2
		System.out.println("-----------------------");

		System.out.println("-----------------------");
		A ab = new B();	    // A 생성자2
							// A 생성자1
							// B 생성자2
							// B 생성자1
		System.out.println("-----------------------");

	}
}
