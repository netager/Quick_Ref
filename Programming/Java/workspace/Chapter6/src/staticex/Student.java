package staticex;

public class Student {
	
	private static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		int i = 10;  // 지역변수 - getSerialNum() 메서드가 사용될 때 메모리 할당
		i++;
		System.out.println(i);
		
		return serialNum;     // static 변수, class 변수 - 프로그램 로딩시 메모리 할당 
	}
	
}
