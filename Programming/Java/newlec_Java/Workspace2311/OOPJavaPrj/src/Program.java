import java.io.IOException;

// -------------------------------------------------------------------------
// �ڹ� ���� ����(���� ���� �ۼ�)
//	1. ������ -> Exam.class
//	2. ���� -> Exam.zip
//	3. jar -> Exam.jar
// ��Ŭ�������� ���� ���� �����
//	1. ��� Project ����
//	2. ������ ���콺 Ŭ��, Export
//	3. Java -> JAR file (���ϻ��� ��������:C:\javalib\examlib.jar)
// �����(���� ������)
// 	1. javac -cp "c:\javalib\examlib.jar" Program.java
// eclipse���� �����
//	1. Project �����Ͽ� ������ ���콺 Ŭ�� -> Build Path -> Configure Build Path Ŭ��
//	2. Libraries -> Add External JARs...
// -------------------------------------------------------------------------

public class Program {
	public static void main(String[] args) throws IOException {
		
		NewlecExam exam = new NewlecExam(1,1,1,1);
		
		System.out.println(exam.total());
		System.out.println(exam.avg());

	}

}
