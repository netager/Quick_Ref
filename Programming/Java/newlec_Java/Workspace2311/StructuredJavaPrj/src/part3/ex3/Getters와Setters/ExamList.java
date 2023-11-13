package part3.ex3.Getters��Setters;

import java.util.Scanner;

public class ExamList {
	
	private Exam[] exams;
	private int current;

	
	public ExamList() {
		
		this(3);
	}

	
	public ExamList(int size) {
		
		exams = new Exam[size];
		current = 0;
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
		
//		exam.setKor(kor);
//		exam.setEng(eng);
//		exam.setMath(math);
		
		Exam[] exams = this.exams;
		int size = this.current;
		
		if(exams.length == size) {
			Exam[] temp = new Exam[exams.length+5];
			
			for(int i=0; i<size;i++)
				temp[i] = exams[i];
			this.exams = temp;
		}
		
		exams[this.current] = exam;
		current++;
	}

	
	public void printList() {
		printList(current);
		
	}
	
	public void printList(int size) {
		
		System.out.println("������������������������������������������");
		System.out.println("��       ���� ���      ��");
		System.out.println("������������������������������������������");
		System.out.println();
		
//		int size = list.current;
		Exam[] exams = this.exams;
		
		for(int i=0; i<size; i++) {
			Exam exam = exams[i];
		
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

}
