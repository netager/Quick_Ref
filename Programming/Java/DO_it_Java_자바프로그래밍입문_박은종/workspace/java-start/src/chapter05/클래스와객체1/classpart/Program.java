package chapter05.Ŭ�����Ͱ�ü1.classpart;

public class Program {

	public static void main(String[] args) {

		Student studentPark = new Student();
		studentPark.studentName = "����ȣ";
		studentPark.studentID = 102;
		studentPark.address = "��û�ϵ�";
		studentPark.showStudentInfor();		
		
		Student studentLee = new Student(1001, "�̼���");
		
//		studentLee.studentName = "�̼���";
//		studentLee.studentID = 100;
		studentLee.address = "����ϵ�";
		studentLee.showStudentInfor();
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.studentID = 101;
		studentKim.address = "����Ư����";

		studentKim.showStudentInfor();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
