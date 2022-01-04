package object;

class Student {
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Student) {
			Student std = (Student)obj;
			
			if(studentID == std.studentID) 
				return true;
			else 
				return false;
		}
		return false;
	}
	
	public int hashCode() {
		return studentID;
	}
}

public class EqualsTest {

	public static void main(String[] args) {
		
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2); // 물리적 동일, 동일한 메모리를 사용하는 지 확인 - false 
		System.out.println(str1.equals(str2)); // 문자열이 같은지 확인 - true
		                                       // 원래는 주소가 같은지 확인했으나 재정의 해서 문자열을 비교
		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		System.out.println("System.identityHashCode(std2)" +System.identityHashCode(std2));
		
		System.out.println("str1.hashCode" + str1.hashCode());
		System.out.println("str2.hashCode" + str2.hashCode());
		
		
		System.out.println("System.identityHashCode(str1)" + System.identityHashCode(str1));
		System.out.println("System.identityHashCode(str2)" +System.identityHashCode(str2));

	}

}
