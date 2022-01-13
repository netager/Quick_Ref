package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 생성자 Overloading()
	public Student() {}  // default 생성자, 생성자가 1개도 없는 경우 jvm에서 자동으로 생성.
	                     // 다른 생성자가 있으면 생성되지 않음.
	
	public Student(int id, String name) {
		
		studentID = id;
		studentName = name;
	}
  
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
  
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}
	
	
}
