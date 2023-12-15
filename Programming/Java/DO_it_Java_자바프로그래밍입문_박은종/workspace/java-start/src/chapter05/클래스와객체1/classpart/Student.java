package chapter05.클래스와객체1.classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 생성자
	// 매개변수가 없는경우 java compiler가 생성함
	// 생성자를 codeing 시 한개라도 만들면 java compiler가 만들지 않음 
	public Student() {
		System.out.println("생성자 Start ........");

	}
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
	}
	
	
	
	public void showStudentInfor() {
		
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		
		this.address = address;
	}

	

}
