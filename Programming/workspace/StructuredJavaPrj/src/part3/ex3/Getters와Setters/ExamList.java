package part3.ex3.Getters��Setters;

import java.util.Scanner;

public class ExamList {
	private Exam[] exams;
	private int current;
	
	public void printList() {
		printList(current);
	}
	
	public void printList(int size) {
		System.out.println("��������������������������������������������������������������������������");
		System.out.println("��          �������                    ��");
		System.out.println("��������������������������������������������������������������������������");
		System.out.println();

		// int size = list.current;
		Exam[] exams = this.exams;
		
		for(int i=0; i<size; i++) {
			Exam exam = exams[i];
		
			// int kor = exam.kor;
			int kor = exam.getKor();			
			int eng = exam.getEng();
			int math = exam.getMath();
			
			int total = exam.total();  // int total = exam.kor + exam.eng + exam.math;
			float avg = exam.avg();    // float avg = total / 3.0f;
			
			
			System.out.printf("���� : %3d\n", kor);
			System.out.printf("���� : %3d\n", eng);
			System.out.printf("���� : %3d\n", math);
	
			System.out.printf("����  : %3d\n", total);
			System.out.printf("���  : %6.2f\n", avg);
			System.out.println("����������������������������������������������������");
		}
	}

	public void inputList() {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("��������������������������������������������������������������������������");
		System.out.println("��          �����Է�                    ��");
		System.out.println("��������������������������������������������������������������������������");
		System.out.println();
		
		int kor, eng, math;
		
		do {
			System.out.printf("����:");
			kor = scan.nextInt();
			
			if(kor<0 || kor>100)
				System.out.printf("��������(0~100)�� ������ϴ�.(%d)\n",kor);
		} while(kor<0 || kor>100);

		do {
			System.out.printf("����:");
			eng = scan.nextInt();
			
			if(eng<0 || eng>100)
				System.out.printf("��������(0~100)�� ������ϴ�.(%d)\n",eng);
		} while(eng<0 || eng>100);

		do {
			System.out.printf("����:");
			math = scan.nextInt();
			
			if(math<0 || math>100)
				System.out.printf("��������(0~100)�� ������ϴ�.(%d)\n",math);
		} while(math<0 || math>100);

		Exam exam = new Exam(kor, eng, math);
		// Exam exam = new Exam();
		// exam.setKor(kor);  		//exam.kor = kor;
		// exam.setEng(eng);       //exam.eng = eng;
		// exam.setMath(math);     //exam.math = math;
		
		Exam[] exams = this.exams;
		int size = current;

		// ���� �迭 ����� 
		if(exams.length == size) {
			// 1. ũ�Ⱑ 5�� ���� �� ū ���ο� �迭 ���� 
			Exam[] temp = new Exam[exams.length + 5];
			// 2. ���� ���ֽ�Ű�� 
			for(int i=0; i<size; i++)
				temp[i] = exams[i];
			// 3. list.exams�� ���� ���� temp �迭�� �����ϵ��� �Ѵ�.
			exams = temp;
		} 
		
		exams[current] = exam;
		current++;
		
	}


	public ExamList() {
		exams = new Exam[3];
		current = 0;
		
	}

}
