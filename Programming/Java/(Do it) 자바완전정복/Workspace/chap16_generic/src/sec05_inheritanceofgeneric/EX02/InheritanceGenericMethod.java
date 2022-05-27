package sec05_inheritanceofgeneric.EX02;

class Parent {
	<T extends Number> void print(T t) {
		System.out.println(t);
	}
	
}

class Child extends Parent {
	
}

public class InheritanceGenericMethod {
	public static void main(String[] args) {
		
		//#1. 부모클래스 제네릭에서도 이용
		Parent p = new Parent();
		p.<Integer>print(10);
		p.print(10);			// 생략 가능
		
		//#2. 자식클래스 제네릭에서도 이용
		Child c = new Child();
		c.<Integer>print(100);
		c.print(100);			// 생략 가능
				
	}
	
}