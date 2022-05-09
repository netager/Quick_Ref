import part3.ex4.UI코드분리하기.Exam;

public class Program {
	
	// 배포파일 만드는 방법
	// --------------
	// 1. 컴파일 -> Exam.class
	// 2. 압축  -> Exam.zip
	// 3. jar  -> Exam.jar

	public static void main(String[] args) {
		
		NewlecExam exam = new NewlecExam(1,1,1,1);
		exam.setKor(10);
		exam.setEng(10);
		exam.setMath(10);
		exam.setCom(10);
		
		System.out.println(exam.total());
		System.out.println(exam.avg());

	}

}
