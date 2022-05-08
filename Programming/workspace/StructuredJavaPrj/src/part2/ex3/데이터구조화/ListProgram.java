package part2.ex3.�����ͱ���ȭ;

import java.util.Scanner;

public class ListProgram {
	
	public static void main(String[] args) {

		ExamList list = new ExamList();
		list.exams = new Exam[3];
		list.current = 0;
		
		int menu;
		boolean keepLoop = true;

		while(keepLoop) {
			
			menu = inputMenu(); 
			
			switch(menu) {
			case 1:
				inputList(list);
				break;
			
			case 2:
				// printList(list, 2);
				printList(list);
				break;
				
			case 3:
				System.out.println("Bye ~~~");
				
				keepLoop = false;
				break;
			
			default:
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �޴��� 1~3���� �Դϴ�.");
			}
		}
		
		System.out.println("good bye ~");

	}
	
	private static void printList(ExamList list) {
		printList(list, list.current);
	}
	
	private static void printList(ExamList list, int size) {
		System.out.println("��������������������������������������������������������������������������");
		System.out.println("��          �������                    ��");
		System.out.println("��������������������������������������������������������������������������");
		System.out.println();

		// int size = list.current;
		Exam[] exams = list.exams;
		
		for(int i=0; i<size; i++) {
			Exam exam = exams[i];
		
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;
			
			int total = exam.kor + exam.eng + exam.math;
			float avg = total / 3.0f;
			
			
			System.out.printf("���� : %3d\n", kor);
			System.out.printf("���� : %3d\n", eng);
			System.out.printf("���� : %3d\n", math);
	
			System.out.printf("����  : %3d\n", total);
			System.out.printf("���  : %6.2f\n", avg);
			System.out.println("����������������������������������������������������");
		}
	}

	private static void inputList(ExamList list) {
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

		Exam exam = new Exam();
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
		Exam[] exams = list.exams;
		int size = list.current;

		// ���� �迭 ����� 
		if(exams.length == size) {
			// 1. ũ�Ⱑ 5�� ���� �� ū ���ο� �迭 ���� 
			Exam[] temp = new Exam[exams.length + 5];
			// 2. ���� ���ֽ�Ű�� 
			for(int i=0; i<size; i++)
				temp[i] = exams[i];
			// 3. list.exams�� ���� ���� temp �迭�� �����ϵ��� �Ѵ�.
			list.exams = temp;
		} 
		
		list.exams[list.current] = exam;
		list.current++;
		
	}

	static int inputMenu() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����������������������������������������������������");
		System.out.println("��          ���θ޴�         ��");
		System.out.println("����������������������������������������������������");
		System.out.println("\t1.�����Է�");
		System.out.println("\t2.�������");
		System.out.println("\t3.����");
		System.out.println("\t����>");
		int menu = scan.nextInt();
		
		return menu;

	}

}
