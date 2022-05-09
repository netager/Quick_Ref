package part3.ex3.Getters와Setters;

import java.util.Scanner;

public class ExamList {
	private Exam[] exams;
	private int current;
	
	public void printList() {
		printList(current);
	}
	
	public void printList(int size) {
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│          성적출력                    │");
		System.out.println("└───────────────────────────────────┘");
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
			
			
			System.out.printf("국어 : %3d\n", kor);
			System.out.printf("영어 : %3d\n", eng);
			System.out.printf("수학 : %3d\n", math);
	
			System.out.printf("총점  : %3d\n", total);
			System.out.printf("평균  : %6.2f\n", avg);
			System.out.println("──────────────────────────");
		}
	}

	public void inputList() {
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

		Exam exam = new Exam(kor, eng, math);
		// Exam exam = new Exam();
		// exam.setKor(kor);  		//exam.kor = kor;
		// exam.setEng(eng);       //exam.eng = eng;
		// exam.setMath(math);     //exam.math = math;
		
		Exam[] exams = this.exams;
		int size = current;

		// 가변 배열 만들기 
		if(exams.length == size) {
			// 1. 크기가 5개 정도 더 큰 새로운 배열 생성 
			Exam[] temp = new Exam[exams.length + 5];
			// 2. 값을 이주시키기 
			for(int i=0; i<size; i++)
				temp[i] = exams[i];
			// 3. list.exams개 새로 만든 temp 배열을 참조하도록 한다.
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
