package part3.ex5.추상화_복습1;

import java.util.Scanner;


public abstract class ExamConsole {
	
	private ExamList list = new ExamList();
	
	public void print() {
		print(list.size());
	}
	
	public void print(int size) {
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│          성적출력                    │");
		System.out.println("└───────────────────────────────────┘");
		System.out.println();

		// int size = list.current;
//		Exam[] exams = this.exams;
		
		for(int i=0; i<size; i++) {
			Exam exam = list.get(i);
		
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();
			
//			int total = exam.getKor() + exam.getEng() + exam.getMath();
			int total = exam.total();
//			float avg = total / 3.0f;
			float avg = exam.avg();
			
			
			System.out.printf("국어 : %3d\n", kor);
			System.out.printf("영어 : %3d\n", eng);
			System.out.printf("수학 : %3d\n", math);
			
			onPrint(exam);
	
			System.out.printf("총점  : %3d\n", total);
			System.out.printf("평균  : %6.2f\n", avg);
			System.out.println("──────────────────────────");
		}
	}


	public void input() {
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

//		Exam exam = new Exam(kor, eng, math);
		Exam exam = makeExam();
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		
		onInput(exam);		
		/*-- add ----------------------------------------- */
		
		list.add(exam);
		
	}

	protected abstract void onPrint(Exam exam);
	
	protected abstract void onInput(Exam exam);

	protected abstract Exam makeExam();

}
