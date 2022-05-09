import part3.ex4.UI코드분리하기.Exam;

public class Program {
	
	// 배포파일 만드는 방법
	// --------------
	// 1. 컴파일 -> Exam.class
	// 2. 압축  -> Exam.zip
	// 3. jar  -> Exam.jar

	public static void main(String[] args) {
		
		Exam exam = new Exam(1,1,1);
		System.out.println(exam.total());
		System.out.println(exam.avg());

	}

}
