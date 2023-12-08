package thisex;

class Person {
	String name;
	int age;
	
	public Person() {
		// name = "test"; // 생성되지 않은 메모리에 값을 assign 하는 케이스가 되어서 오류
		this("이름없음", 1);
		name = "test";  // 생성자 이후에 값을 설정하므로 정상 동작.
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
