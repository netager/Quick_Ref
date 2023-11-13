package part3.ex4.UI�ڵ�и��ϱ�;

import java.util.Scanner;

public class ExamConsole {
	
	private ExamList list = new ExamList();
	
	public void printList() {
		printList(list.size());
		
	}
	
	public void printList(int size) {
		
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
			
			System.out.printf("���� : %3d\n", total);
			System.out.printf("��� : %6.9f\n", avg);
			System.out.println("������������������������������������������");
		}
	}

	
	public void inputList() {
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

		System.out.println("������������������������������������������");
		
		Exam exam = new Exam(kor, eng, math);
		
		/*-- add ----------------- */
		list.add(exam);
	}


}


