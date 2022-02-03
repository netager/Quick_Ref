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
		
		if (obj instanceof Student) {
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
		
		// false 
		// str1 과 str2의 메모리 주소값이 다르기 때문에 false
		// 물리적 동일함을 체크
		System.out.println(str1 == str2);
		
		// true
		// str1 과 str2의 텍스트가 동일한지 비교하므로  true 출력.
		// equls()는 원래 주소가 같은지를 확인하나 재정의하여 텍스트가 같은지 확인하도록 변경함.
		// 논리적 동일함을 체크.
		System.out.println(str1.equals(str2));
		
		
		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");
		
		System.out.println(std1 + "," + std2 + "," + (std1 == std2));
		System.out.println(std1.equals(std2));
		
		// 10진수 Address 값 반환
		System.out.println("std1.hashCode() : " + std1.hashCode());
		System.out.println("std2.hashCode() : " + std2.hashCode());

		// hashCode() 메서드가 재정의 되어서 동일하게 나옴
		// 실제로 str1과 str2의 Heap 메모리는 다르나 hashCode() 메서드 재정의로 동일하게 출력
		// 논리적으로 동일하도록 equals()를 재정의하면 hashCode()도 동일한 값이 반환되도록 해야 함.
		// equeals()를 재정의하면 hashCode()도 재정의 해야 함.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// 실제의 hashCode 값을 보고자 할때
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	
		

	}

}
