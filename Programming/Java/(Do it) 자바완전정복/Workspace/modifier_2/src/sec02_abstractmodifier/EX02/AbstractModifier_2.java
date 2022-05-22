package sec02_abstractmodifier.EX02;

// �߻�Ŭ����/�߻�޼��� ����ϴ� ���
abstract class Animal {
	abstract void cry();
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("�߿�");
	}

}

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("�۸�");
		
	}
	
}

abstract class B {	// abstract class �� ��üȭ ���� ���ϴ�.
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
