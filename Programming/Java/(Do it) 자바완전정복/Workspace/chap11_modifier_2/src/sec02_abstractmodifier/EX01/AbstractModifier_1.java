package sec02_abstractmodifier.EX01;

// �Ϲ� Ŭ������ ����ϴ� ��� 
class Animal {
	void cry() {}
}

class Cat extends Animal {
//	void cry() {
//		System.out.println("�߿�");
//	}

	void cRy() {	// �Ǽ��� overriding ö�� ����
		System.out.println("�߿�");
	}

}

class Dog extends Animal {
	void cry() {
		System.out.println("�۸�");
	}
}


public class AbstractModifier_1 {
	public static void main(String[] args) {
		
		//#1. ��ü����
		Animal animal1 = new Cat();
		animal1.cry();
		
		Animal animal2 = new Dog();
		animal2.cry();
	}
}
