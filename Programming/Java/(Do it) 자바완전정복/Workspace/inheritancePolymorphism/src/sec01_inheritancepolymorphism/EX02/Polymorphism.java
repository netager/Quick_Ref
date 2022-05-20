package sec01_inheritancepolymorphism.EX02;

// 상속관계 만들기
class A{}
class B extends A {}
class C extends B {}
class D extends B {}


public class Polymorphism {
	public static void main(String[] args) {
		
		//#1.
		A a1 = new A();	// A는 A이다 (O)
		A a2 = new B(); // B는 A이다 (O)
		A a3 = new C(); // C는 A이다 (O)
		A a4 = new D(); // D는 A이다 (O)
		
//		B b1 = new A(); // A는 B이다 (X)
		B b2 = new B();	// B는 B이다 (O)
		B b3 = new C(); // C는 B이다 (O)
		B b4 = new D(); // D는 B이다 (O)
		
//		C c1 = new A(); // A는 C이다 (X)
//		C c2 = new B();	// B는 C이다 (X)
		C c3 = new C(); // C는 C이다 (O)
//		C c4 = new D(); // D는 C이다 (X)
		
//		D d1 = new A(); // A는 D이다 (X)
//		D d2 = new B();	// B는 D이다 (X)
//		D d3 = new C(); // C는 D이다 (X)
		D d4 = new D(); // D는 C이다 (O)
}
	
}
