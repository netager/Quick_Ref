package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// ������ Overloading()
	public Student() {}  // default ������, �����ڰ� 1���� ���� ��� jvm���� �ڵ����� ����.
	                     // �ٸ� �����ڰ� ������ �������� ����.
	
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
