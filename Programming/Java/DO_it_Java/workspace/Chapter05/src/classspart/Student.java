package classspart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;

	//public Student() {} - 생성자를 코딩하지 않으면 컴파일러가 자동으로 넣어줌.
	
	public Student() {}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	
    public void showStudentInfor() {
    	System.out.println(studentName + "," + address);
    }
    
    public String getStudentName() {
    	return studentName;
    }
    
    public void setStudentName(String name) {
    	studentName = name;
    }   
}
