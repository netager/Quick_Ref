package chapter05.Ŭ�����Ͱ�ü1.classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// ������
	// �Ű������� ���°�� java compiler�� ������
	// �����ڸ� codeing �� �Ѱ��� ����� java compiler�� ������ ���� 
	public Student() {
		System.out.println("������ Start ........");

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
