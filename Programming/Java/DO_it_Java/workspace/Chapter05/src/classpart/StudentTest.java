package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "�̼���"); // default ������ Call
		studentLee.address = "���ֽ� �ϻ걸 ���ϻ굿";
		
		Student studentKim = new Student(); // default ������ Call
		studentKim.studentName = "������";
		studentKim.studentID = 101;
		studentKim.address = "����� ������";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		// studentLee - ���� ���� 
		// classpart.Student@4926097b - ���� ��(������ �ν��Ͻ��� ���޸� �ּ� ��)
		System.out.println(studentLee); // 32bit Addr - classpart.Student@4926097bb - ���޸� �ּ� 
		System.out.println(studentKim); // 32bit Addr - classpart.Student@762efe5d
		
	}

}
