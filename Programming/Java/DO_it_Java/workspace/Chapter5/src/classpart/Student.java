package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
  
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
  
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		this.studentName = name;
	}
	
}
