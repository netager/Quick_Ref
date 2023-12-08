package chapter11.기본클래스.class_;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		
		// 원격에 있는 Class를 로딩하거나, 현재 어떤 타입인지 모르는 경우 
		// 알지 못하는 class 타입을 이용해서 프로그래밍 - 리플렉션 프로그래밍 
		// 이때 Class 클래스를 사용함.
		
		// Class 클래스
		//   - 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일로 생성됨
		//   - class 파일에는 객체의 정보(멤버변수, 메서드, 생성자 등) 가 포함되어 있음
		//   - Class 클래스는 컴파일된 class 파일에서 객체의 정보를 가져올 수 있음
		
		// Class.forName("클래스 이름") - 반드시 기억
		

		Person person = new Person();
		
		// Class 클래스를 가져오는 방법 3가지
		// -------------------------
		// 첫번째 와 두번째는 사전에 Class를 알고 있는경우 사용
		// 세번째는 어떤 Class 인지 모르는 경우 사용 - 매우 중요함.
		
		// 첫번째 방법
		Class pClass1 = person.getClass(); // getClass()는 Object 의 메서드
		                                  // getClass()는 Class 클래스를 반환해 주는 메서드
		System.out.println(pClass1.getName());

		// 두번째 방법
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		// 세번째 방법 - 동적 로딩
		Class pClass3 = Class.forName("chapter11.기본클래스.class_.Person");
		System.out.println(pClass3.getName());
		
		Class pClass4 = Class.forName("java.lang.String"); 
		System.out.println(pClass4.getName());
		
		
		Person p = new Person();
		System.out.println(p);
		
		Class pClass = Class.forName("chapter11.기본클래스.class_.Person");
		Person p2 = (Person)pClass.newInstance();  // default construcor call
		System.out.println(p2);
		
		
	}

}
