package thisex;

class Person {
	String name;
	int age;
	
	public Person() {
		// name = "test"; // �������� ���� �޸𸮿� ���� assign �ϴ� ���̽��� �Ǿ ����
		this("�̸�����", 1);
		name = "test";  // ������ ���Ŀ� ���� �����ϹǷ� ���� ����.
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.name);
		
		System.out.println(p1.returnSelf());
		System.out.println(p1);
	}

}
