package sec02_interface.EX04;


//#방법1. 자식클래스 생성 + 자식클래스 생성자로 객체 생성 
interface A {
	int  a = 3;
	void abc();
}

class B implements A {
	@Override
	public void abc() {
		System.out.println("방법#1. 자식클래스 생성 + 자식클래스 생성자로 객체 생성");
	}
}
public class CreateObjectOfInterface_1 {
	public static void main(String[] args) {
		
		//#1. 객체 생성
		B b1 = new B();
		B b2 = new B();
		
		//#2. 메서드 호출
		b1.abc();
		b2.abc();
	}
}
