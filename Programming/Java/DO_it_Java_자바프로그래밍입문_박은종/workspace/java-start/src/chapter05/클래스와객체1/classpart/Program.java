package chapter05.클래스와객체1.classpart;

public class Program {

	public static void main(String[] args) {

		Student studentPark = new Student();
		studentPark.studentName = "박찬호";
		studentPark.studentID = 102;
		studentPark.address = "충청북도";
		studentPark.showStudentInfor();		
		
		Student studentLee = new Student(1001, "이순신");
		
//		studentLee.studentName = "이순신";
//		studentLee.studentID = 100;
		studentLee.address = "전라북도";
		studentLee.showStudentInfor();
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "서울특별시";

		studentKim.showStudentInfor();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
