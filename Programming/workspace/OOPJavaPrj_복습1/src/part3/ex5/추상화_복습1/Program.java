package part3.ex5.추상화_복습1;

public class Program {

	public static void main(String[] args) {
		
		NewlecExam exam = new NewlecExam(1,1,1,1);
		
		System.out.println(exam.total());
		System.out.println(exam.avg());

	}

}
