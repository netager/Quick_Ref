package chapter05.클래스와객체1.reference;

public class Program {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "이순신");
		
		studentLee.setKorea(90);
		studentLee.setMath(80);
		
		studentLee.showStudentInfo();
				

		Student studentTomas = new Student(101, "Tomas");
		
		studentTomas.setKorea(100);
		studentTomas.setMath(90);
		
		studentTomas.showStudentInfo();

	}

}
