package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person();
		
		Class pClass1 = person.getClass(); // 객체가 생성된 후 
		
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
		
		Class pClass4 = Class.forName("java.lang.String");
		System.out.println(pClass4.getName());  // 동적 로딩
		
	}

}
