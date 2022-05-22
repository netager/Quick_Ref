package sec02_abstractmodifier.EX02;

// 추상클래스/추상메서드 사용하는 경우
abstract class Animal {
	abstract void cry();
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("야옹");
	}

}

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("멍멍");
		
	}
	
}

abstract class B {	// abstract class 는 객체화 하지 못하다.
	void bcd() {
		
	}
}

public class AbstractModifier_2 {
	public static void main(String[] args) {
		Animal animal1 = new Cat();
		animal1.cry();
		
		Animal animal2 = new Dog();
		animal2.cry();
		
	}
}
