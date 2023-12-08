package chapter11.�⺻Ŭ����.class_;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		
		// ���ݿ� �ִ� Class�� �ε��ϰų�, ���� � Ÿ������ �𸣴� ��� 
		// ���� ���ϴ� class Ÿ���� �̿��ؼ� ���α׷��� - ���÷��� ���α׷��� 
		// �̶� Class Ŭ������ �����.
		
		// Class Ŭ����
		//   - �ڹ��� ��� Ŭ������ �������̽��� ������ �� class ���Ϸ� ������
		//   - class ���Ͽ��� ��ü�� ����(�������, �޼���, ������ ��) �� ���ԵǾ� ����
		//   - Class Ŭ������ �����ϵ� class ���Ͽ��� ��ü�� ������ ������ �� ����
		
		// Class.forName("Ŭ���� �̸�") - �ݵ�� ���
		

		Person person = new Person();
		
		// Class Ŭ������ �������� ��� 3����
		// -------------------------
		// ù��° �� �ι�°�� ������ Class�� �˰� �ִ°�� ���
		// ����°�� � Class ���� �𸣴� ��� ��� - �ſ� �߿���.
		
		// ù��° ���
		Class pClass1 = person.getClass(); // getClass()�� Object �� �޼���
		                                  // getClass()�� Class Ŭ������ ��ȯ�� �ִ� �޼���
		System.out.println(pClass1.getName());

		// �ι�° ���
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		// ����° ��� - ���� �ε�
		Class pClass3 = Class.forName("chapter11.�⺻Ŭ����.class_.Person");
		System.out.println(pClass3.getName());
		
		Class pClass4 = Class.forName("java.lang.String"); 
		System.out.println(pClass4.getName());
		
		
		Person p = new Person();
		System.out.println(p);
		
		Class pClass = Class.forName("chapter11.�⺻Ŭ����.class_.Person");
		Person p2 = (Person)pClass.newInstance();  // default construcor call
		System.out.println(p2);
		
		
	}

}
