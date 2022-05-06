package part2.ex3.�����ͱ���ȭ;

import java.util.Scanner;

public class ExamProgram {
	
	public static void main(String[] args) {

		Exam exam = new Exam(); // �������·θ� ����� ����.
		
		input(exam);
		
		print(exam);
		
	}

	private static void print(Exam exam) {
		System.out.println("����������������������������������������������������");
		System.out.println("��          �������         ��");
		System.out.println("����������������������������������������������������");
		System.out.println();

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

	private static void input(Exam exam) {
		Scanner scan = new Scanner(System.in);
		int kor;
		int eng;
		int math;
		
		System.out.println("����������������������������������������������������");
		System.out.println("��          �����Է�         ��");
		System.out.println("����������������������������������������������������");
		System.out.println();
		
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

		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
	}

}
