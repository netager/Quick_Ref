package sec02_abstractmodifier.EX01;

// 老馆 努贰胶甫 惑加窍绰 版快 
class Animal {
	void cry() {}
}

class Cat extends Animal {
//	void cry() {
//		System.out.println("具克");
//	}

	void cRy() {	// 角荐肺 overriding 枚磊 坷幅
		System.out.println("具克");
	}

}

class Dog extends Animal {
	void cry() {
		System.out.println("港港");
	}
}


public class AbstractModifier_1 {
	public static void main(String[] args) {
		
		//#1. 按眉积己
		Animal animal1 = new Cat();
		animal1.cry();
		
		Animal animal2 = new Dog();
		animal2.cry();
	}
}
