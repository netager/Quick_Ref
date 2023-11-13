import java.io.IOException;

// -------------------------------------------------------------------------
// 자바 재사용 절차(배포 파일 작성)
//	1. 컴파일 -> Exam.class
//	2. 압축 -> Exam.zip
//	3. jar -> Exam.jar
// 이클립스에서 배포 파일 만들기
//	1. 대상 Project 선택
//	2. 오른쪽 마우스 클릭, Export
//	3. Java -> JAR file (파일생성 예시폴더:C:\javalib\examlib.jar)
// 사용방법(수동 컴파일)
// 	1. javac -cp "c:\javalib\examlib.jar" Program.java
// eclipse에서 사용방법
//	1. Project 선택하여 오른쪽 마우스 클릭 -> Build Path -> Configure Build Path 클릭
//	2. Libraries -> Add External JARs...
// -------------------------------------------------------------------------

public class Program {
	public static void main(String[] args) throws IOException {
		
		NewlecExam exam = new NewlecExam(1,1,1,1);
		
		System.out.println(exam.total());
		System.out.println(exam.avg());

	}

}
