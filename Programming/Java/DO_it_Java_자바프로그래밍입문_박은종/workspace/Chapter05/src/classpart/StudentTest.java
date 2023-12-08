package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "이순신"); // default 생성자 Call
		studentLee.address = "전주시 완산구 서완산동";
		
		Student studentKim = new Student(); // default 생성자 Call
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "서울시 덕진구";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		// studentLee - 참조 변수 
		// classpart.Student@4926097b - 참조 값(생성된 인스턴스의 힙메모리 주소 값)
		System.out.println(studentLee); // 32bit Addr - classpart.Student@4926097bb - 힙메모리 주소 
		System.out.println(studentKim); // 32bit Addr - classpart.Student@762efe5d
		
	}

}
