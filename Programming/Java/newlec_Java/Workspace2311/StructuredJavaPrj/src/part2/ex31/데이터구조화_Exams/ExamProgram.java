package part2.ex31.데이터구조화_Exams;

import java.util.Scanner;

public class ExamProgram {
	
	public static void main(String[] args) {

		Exam exam = new Exam();
		
		input(exam);
		print(exam);

	}

	private static void print(Exam exam) {
		
		System.out.println("┌───────────────────┐");
		System.out.println("│       성적 출력      │");
		System.out.println("└───────────────────┘");
		System.out.println();
		
		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;
		
		int total = kor + eng + math;
		float avg = total/3.0f; 
		
		System.out.printf("국어 : %3d\n", kor);
		System.out.printf("영어 : %3d\n", eng);
		System.out.printf("수학 : %3d\n", math);
		
		System.out.printf("총점 : %3d\n", total);
		System.out.printf("평균 : %6.9f\n", avg);
		System.out.println("─────────────────────");

	}

	private static void input(Exam exam) {
		
		Scanner scan =  new Scanner(System.in);
		int kor, eng, math;

		System.out.println("┌───────────────────┐");
		System.out.println("│       성적 입력      │");
		System.out.println("└───────────────────┘");

		do {
			System.out.printf("국어 :");
			kor = scan.nextInt();
			
			if (kor < 0 || 100 < kor)
				System.out.println("성적범위(0~100)를 벗어났습니다.");
		} while(kor < 0 || 100 < kor);

		do {
			System.out.printf("영어 :");
			eng = scan.nextInt();
			
			if (eng < 0 || 100 < eng)
				System.out.println("성적범위(0~100)를 벗어났습니다.");
		} while(eng < 0 || 100 < eng);

		do {
			System.out.printf("수학 :");
			math = scan.nextInt();
			
			if (math < 0 || 100 < math)
				System.out.println("성적범위(0~100)를 벗어났습니다.");
		} while(math < 0 || 100 < math);

		System.out.println("─────────────────────");
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
	}
			
}