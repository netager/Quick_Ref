package part3.ex5.�߻�ȭ;

import java.util.Scanner;

public class NewlecExamConsole extends ExamConsole {

	@Override
	protected Exam makeExam() {

		return new NewlecExam();
	}

	
	@Override
	protected void onPrint(Exam exam) {

		NewlecExam newlecExam = (NewlecExam) exam;	// com�� ����ϱ� ���� ����ȯ
		int com = newlecExam.getCom();
		System.out.printf("��ǻ�� : %3d\n", com);
		
	}

	@Override
	protected void onInput(Exam exam) {

		NewlecExam newlecExam = (NewlecExam) exam;	// com�� ����ϱ� ���� ����ȯ
		Scanner scan =  new Scanner(System.in);
		int com;
		
		do {
			System.out.printf("��ǻ�� :");
			com = scan.nextInt();
			
			if (com < 0 || 100 < com)
				System.out.println("��������(0~100)�� ������ϴ�.");
		} while(com < 0 || 100 < com);

		newlecExam.setCom(com);
	}

}
