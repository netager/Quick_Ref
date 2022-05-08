package part3.ex1.캡슐화;

import java.util.Scanner;

public class ExamList {
	Exam[] exams;
	int current;
	
	static void printList(ExamList list) {
		printList(list, list.current);
	}
	
	static void printList(ExamList list, int size) {
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│          성적출력                    │");
		System.out.println("└───────────────────────────────────┘");
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
			
			
			System.out.printf("국어 : %3d\n", kor);
			System.out.printf("영어 : %3d\n", eng);
			System.out.printf("수학 : %3d\n", math);
	
			System.out.printf("총점  : %3d\n", total);
			System.out.printf("평균  : %6.2f\n", avg);
			System.out.println("──────────────────────────");
		}
	}

	static void inputList(ExamList list) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│          성적입력                    │");
		System.out.println("└───────────────────────────────────┘");
		System.out.println();
		
		int kor, eng, math;
		
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

		Exam exam = new Exam();
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
		Exam[] exams = list.exams;
		int size = list.current;

		// 가변 배열 만들기 
		if(exams.length == size) {
			// 1. 크기가 5개 정도 더 큰 새로운 배열 생성 
			Exam[] temp = new Exam[exams.length + 5];
			// 2. 값을 이주시키기 
			for(int i=0; i<size; i++)
				temp[i] = exams[i];
			// 3. list.exams개 새로 만든 temp 배열을 참조하도록 한다.
			list.exams = temp;
		} 
		
		list.exams[list.current] = exam;
		list.current++;
		
	}

	public static void init(ExamList list) {
		list.exams = new Exam[3];
		
	}

}
