package part3.ex5.�߻�ȭ;

import java.util.Scanner;

public abstract class ExamConsole {
	
	private ExamList list = new ExamList();
	
	public void print() {
		print(list.size());
		
	}
	
	public void print(int size) {
		
		System.out.println("������������������������������������������");
		System.out.println("��       ���� ���      ��");
		System.out.println("������������������������������������������");
		System.out.println();
		
//		int size = list.current;
//		Exam[] exams = this.exams;
		
		for(int i=0; i<size; i++) {
			Exam exam = list.get(i);
		
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();
			
			
			int total = exam.total();
			float avg = exam.avg(); 
				
			System.out.printf("���� : %3d\n", kor);
			System.out.printf("���� : %3d\n", eng);
			System.out.printf("���� : %3d\n", math);
			onPrint(exam);
			
			System.out.printf("���� : %3d\n", total);
			System.out.printf("��� : %6.9f\n", avg);
			System.out.println("������������������������������������������");
		}
	}

	
	public void input() {
		Scanner scan =  new Scanner(System.in);

		System.out.println("������������������������������������������");
		System.out.println("��       ���� �Է�      ��");
		System.out.println("������������������������������������������");
		System.out.println();
		
		int kor, eng, math;
	
		do {
			System.out.printf("���� :");
			kor = scan.nextInt();
			
			if (kor < 0 || 100 < kor)
				System.out.println("��������(0~100)�� ������ϴ�.");
		} while(kor < 0 || 100 < kor);

		do {
			System.out.printf("���� :");
			eng = scan.nextInt();
			
			if (eng < 0 || 100 < eng)
				System.out.println("��������(0~100)�� ������ϴ�.");
		} while(eng < 0 || 100 < eng);

		do {
			System.out.printf("���� :");
			math = scan.nextInt();
			
			if (math < 0 || 100 < math)
				System.out.println("��������(0~100)�� ������ϴ�.");
		} while(math < 0 || 100 < math);
		
		
		Exam exam = makeExam();
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		
		onInput(exam);
		System.out.println("������������������������������������������");
		
		/*-- add ----------------- */
		list.add(exam);
	}
	
	
	protected abstract void onPrint(Exam exam);

	protected abstract void onInput(Exam exam);

	protected abstract Exam makeExam();

}


