package chapter11.기본클래스.equals;

class Student {
	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student)obj;
			if (studentID == std.studentID) 
				return true;
			else 
				return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentID;
	}

}


public class EqualsTest {

	public static void main(String[] args) {

		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2);
		
		// String 은 hashCode() 의 값이 같다.
		// 이유는 String에서 hashCode()가 재정의 되어 있음.
		// 재정의전 hashCode를 보려면 System.identityHashCode() 사용
		// -------------------------------------------------
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(str1.equals(str2));
		System.out.println("----------------------------------------");

		// equals 재정의 Test
		// ----------------
		
		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");

		System.out.println(std1 == std2);
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		System.out.println(std1.equals(std2)); // 재정의 가능
		
		// 논리적으로 동일함을 위해 equals() 메서드를 재정의 하였다면 hashCode() 메서드를
		// 재정의하여 동일한 값이 반환 되도록 함.
		// 따라서, String, Integer 등은 equals() 와 hashCode()를 재정의 함.
		// equals() 재정의하고 hashCode()를 재정의 하지 않은면 Collections 사용 시 
		// 문제될 수 도 있음
	}

}
