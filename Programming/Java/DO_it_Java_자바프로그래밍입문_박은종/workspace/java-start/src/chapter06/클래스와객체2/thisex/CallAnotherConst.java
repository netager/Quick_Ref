package chapter06.Ŭ�����Ͱ�ü2.thisex;

class Person {
	String name;
	int age;
	
	public Person() {
		
		this("�̸�����", 1);
		
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
