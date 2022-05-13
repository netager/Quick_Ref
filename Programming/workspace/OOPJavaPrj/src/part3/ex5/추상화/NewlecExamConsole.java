package part3.ex5.추상화;

import java.util.Scanner;

import part3.ex5.추상화_복습1.Exam;
import part3.ex5.추상화_복습1.ExamConsole;

public class NewlecExamConsole extends ExamConsole {

	@Override
	protected Exam makeExam() {
		// TODO Auto-generated method stub
		return new NewlecExam();
	}

	@Override
	protected void onPrint(Exam exam) {
		NewlecExam newlecExam = (NewlecExam)exam;
		int com = newlecExam.getCom();
		System.out.printf("컴퓨터 : %3d\n", com);
		
	}

	@Override
	protected void onInput(Exam exam) {
		NewlecExam newlecExam = (NewlecExam)exam;
		
		Scanner scan = new Scanner(System.in);
		int com;
		
		do {
			System.out.printf("컴퓨터:");
			com = scan.nextInt();
			
			if(com<0 || com>100)
				System.out.printf("성적범위(0~100)을 벗어났습니다.(%d)\n",com);
		} while(com<0 || com>100);
		
		newlecExam.setCom(com);
		
	}

}
