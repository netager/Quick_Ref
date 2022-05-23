package sec05_superkeywordwupermethod.EX02;


class A {
	void abc() {
		System.out.println("A 클래스의 abc()");
	}
}

class B extends A {
	@Override
	void abc() {
		System.out.println("B 클래스의 abc()");
	}
	
	void bcd() {
		abc();
		this.abc();
		super.abc();
	}
}


public class SuperKeyword_2 {
	public static void main(String[] args) {
		
		//#1. 객체 생성
		B bb = new B();
		bb.bcd(); 	// B - abc()
		 			// B - abc()
					// A - abc()
	}

}
