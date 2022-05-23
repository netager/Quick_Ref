package sec02_interface.EX03;

// 접근지정자 - 상속하거나 implements할때 접근지정자는 축소하면 안됨.
interface A {
	public abstract void abc();
}

interface B {
	void bcd();	// 컴파일러가 자동으로 변경해줌 - public abstract void bcd() 
}

class C implements A {
	public void abc() {
		
	}
}

class D implements B {
//	void bcd() {	// 상속받은 인터페이스 B의 bcd() 메서드는 public abstract 임.
		 			// 상속 받은 D 클래스에서 구현시 public 으로 구현해야 함.
					// 상속 받은 D 클래스의 bcd() 메서드에 접근지정자를 생략하면 default가 됨.
	
	public void bcd() {
		
	}
}


public class InheritanceOfInterface_2 {

}
