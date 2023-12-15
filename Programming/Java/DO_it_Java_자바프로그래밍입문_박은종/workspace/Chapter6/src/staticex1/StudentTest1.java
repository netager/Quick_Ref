package staticex1;

public class StudentTest1 {
	
	public static void main(String[] args) {
		
		Student studentJ = new Student();
		System.out.println(Student.serialNum); // 바로 class 이름으로 참조함.
		System.out.println(studentJ.studentID);
		
		Student studentT = new Student();
		System.out.println(Student.serialNum);
		System.out.println(studentT.studentID);
	}
	

}
