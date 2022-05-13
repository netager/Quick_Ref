import part3.ex4.UI코드분리하기_복습1.Exam;

public class Program {

	public static void main(String[] args) {
		NewlecExam exam = new NewlecExam(10, 10, 10, 10);
//		exam.setKor(10);
//		exam.setEng(10);
//		exam.setMath(10);
//		exam.setCom(10);
		
		System.out.println(exam.total());
		System.out.println(exam.avg());

	}

}
