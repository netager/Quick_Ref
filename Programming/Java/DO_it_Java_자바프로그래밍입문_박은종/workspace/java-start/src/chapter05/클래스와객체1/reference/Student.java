package chapter05.Ŭ�����Ͱ�ü1.reference;

public class Student {
	
	int studentID;
	String studentName;
	Subject korea;
	Subject math;
	
	public Student() {
		 korea = new Subject("����");
		 math = new Subject("����");
	}
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;

		 korea = new Subject("����");
		 math = new Subject("����");

	}
	
	public void setKorea(int score) {
		korea.setScore(score);
	}
	
	public void setMath(int score) {
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + " �л��� ������ " + total + "�� �Դϴ�.");
	}
	
	

}
