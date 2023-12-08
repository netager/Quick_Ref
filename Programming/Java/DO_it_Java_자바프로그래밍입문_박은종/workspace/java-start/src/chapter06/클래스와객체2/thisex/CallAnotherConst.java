package chapter06.클래스와객체2.thisex;

class Person {
	String name;
	int age;
	
	public Person() {
		
		this("이름없음", 1);
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printPerson() {
		System.out.println(name + " / " + age);
	}
	
	public Person returnSelf() {
		return this;
	}
}


public class CallAnotherConst {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.printPerson();
		System.out.println(p1.returnSelf());
	
	}
}
