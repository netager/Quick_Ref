package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		// Class 사용법 1
		Person person = new Person();
		
		// Class Class를 반환하는 메서드 
		Class pClass1 = person.getClass();
		
		System.out.println(pClass1.getName());
		

		// Class 사용법 2
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		
		
		// Class 사용법 3
		// 문자열을 써서 이름을 가진 Class가 있으면 메모리에 로딩함. 동적 로딩.
		
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
		
		Class pClass4 = Class.forName("java.lang.String");
		System.out.println(pClass4.getName());

	}

}
