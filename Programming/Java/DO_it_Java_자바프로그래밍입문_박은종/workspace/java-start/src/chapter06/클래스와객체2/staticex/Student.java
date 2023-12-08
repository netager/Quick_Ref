package chapter06.클래스와객체2.staticex;

public class Student {
	
	private static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		int i = 10; // 지역변수 - 메서드가 호출될때 메모리에 생성
		i++;
		System.out.println(i);
		
//		studentName = "홍길동"; // 멤버변수, 인스턴스 변수 - 인스턴스 생성시(new)시 메모리에 생성
		
		return serialNum; // static 변수, class 변수 - 실행 또는 load 시 메모리에 생성
	}

}
