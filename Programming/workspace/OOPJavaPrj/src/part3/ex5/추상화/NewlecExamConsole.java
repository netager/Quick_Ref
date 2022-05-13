package part3.ex5.�߻�ȭ;

import java.util.Scanner;

import part3.ex5.�߻�ȭ_����1.Exam;
import part3.ex5.�߻�ȭ_����1.ExamConsole;

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
		System.out.printf("��ǻ�� : %3d\n", com);
		
	}

	@Override
	protected void onInput(Exam exam) {
		NewlecExam newlecExam = (NewlecExam)exam;
		
		Scanner scan = new Scanner(System.in);
		int com;
		
		do {
			System.out.printf("��ǻ��:");
			com = scan.nextInt();
			
			if(com<0 || com>100)
				System.out.printf("��������(0~100)�� ������ϴ�.(%d)\n",com);
		} while(com<0 || com>100);
		
		newlecExam.setCom(com);
		
	}

}
