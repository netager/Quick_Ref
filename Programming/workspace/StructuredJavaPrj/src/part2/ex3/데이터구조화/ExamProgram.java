package part2.ex3.데이터구조화;

import java.util.Scanner;

public class ExamProgram {
	
	public static void main(String[] args) {

		Exam exam = new Exam(); // 참조형태로만 사용이 가능.
		
		input(exam);
		
		print(exam);
		
	}

	private static void print(Exam exam) {
		System.out.println("┌────────────────────────┐");
		System.out.println("│          성적출력         │");
		System.out.println("└────────────────────────┘");
		System.out.println();

		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;
		
		int total = exam.kor + exam.eng + exam.math;
		float avg = total / 3.0f;
		
		
		System.out.printf("국어 : %3d\n", kor);
		System.out.printf("영어 : %3d\n", eng);
		System.out.printf("수학 : %3d\n", math);

		System.out.printf("총점  : %3d\n", total);
		System.out.printf("평균  : %6.2f\n", avg);
		System.out.println("──────────────────────────");
		
	}

	private static void input(Exam exam) {
		Scanner scan = new Scanner(System.in);
		int kor;
		int eng;
		int math;
		
		System.out.println("┌────────────────────────┐");
		System.out.println("│          성적입력         │");
		System.out.println("└────────────────────────┘");
		System.out.println();
		
		do {
			System.out.printf("국어:");
			kor = scan.nextInt();
			
			if(kor<0 || kor>100)
				System.out.printf("성적범위(0~100)을 벗어났습니다.(%d)\n",kor);
		} while(kor<0 || kor>100);

		do {
			System.out.printf("영어:");
			eng = scan.nextInt();
			
			if(eng<0 || eng>100)
				System.out.printf("성적범위(0~100)을 벗어났습니다.(%d)\n",eng);
		} while(eng<0 || eng>100);

		do {
			System.out.printf("수학:");
			math = scan.nextInt();
			
			if(math<0 || math>100)
				System.out.printf("성적범위(0~100)을 벗어났습니다.(%d)\n",math);
		} while(math<0 || math>100);

		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
	}

}
