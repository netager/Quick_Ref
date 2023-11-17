package part3.ex5.추상화;

import java.util.Scanner;

public class NewlecExamConsole extends ExamConsole {

	@Override
	protected Exam makeExam() {

		return new NewlecExam();
	}

	
	@Override
	protected void onPrint(Exam exam) {

		NewlecExam newlecExam = (NewlecExam) exam;	// com을 사용하기 위한 형변환
		int com = newlecExam.getCom();
		System.out.printf("컴퓨터 : %3d\n", com);
		
	}

	@Override
	protected void onInput(Exam exam) {

		NewlecExam newlecExam = (NewlecExam) exam;	// com을 사용하기 위한 형변환
		Scanner scan =  new Scanner(System.in);
		int com;
		
		do {
			System.out.printf("컴퓨터 :");
			com = scan.nextInt();
			
			if (com < 0 || 100 < com)
				System.out.println("성적범위(0~100)를 벗어났습니다.");
		} while(com < 0 || 100 < com);

		newlecExam.setCom(com);
	}

}
