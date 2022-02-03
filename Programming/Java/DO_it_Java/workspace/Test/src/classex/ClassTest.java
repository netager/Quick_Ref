package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		// Class ���� 1
		Person person = new Person();
		
		// Class Class�� ��ȯ�ϴ� �޼��� 
		Class pClass1 = person.getClass();
		
		System.out.println(pClass1.getName());
		

		// Class ���� 2
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		
		
		// Class ���� 3
		// ���ڿ��� �Ἥ �̸��� ���� Class�� ������ �޸𸮿� �ε���. ���� �ε�.
		
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
		
		Class pClass4 = Class.forName("java.lang.String");
		System.out.println(pClass4.getName());

	}

}
