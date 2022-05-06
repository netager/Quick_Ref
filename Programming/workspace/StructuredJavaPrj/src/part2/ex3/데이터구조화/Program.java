package part2.ex3.데이터구조화;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Exam[] exams = new Exam[3];
		
		int menu;
		boolean keepLoop = true;

		while(keepLoop) {
			
			menu = inputMenu(); 
			
			switch(menu) {
			case 1:
				inputList(exams);
				break;
			
			case 2:
				printList(exams);
				break;
				
			case 3:
				System.out.println("Bye ~~~");
				
				keepLoop = false;
				break;
			
			default:
				System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지 입니다.");
			}
		}
		
		System.out.println("good bye ~");


	}
	
	private static void printList(Exam[] exams) {
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│          성적출력                    │");
		System.out.println("└───────────────────────────────────┘");
		System.out.println();

		for(int i=0; i<3; i++) {
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

	private static void inputList(Exam[] exams) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│          성적입력                    │");
		System.out.println("└───────────────────────────────────┘");
		System.out.println();
		
		 for(int i=0;i<3; i++) {
			 
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
			
			exams[i] = exam;
		 }
		
	}

	static int inputMenu() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌────────────────────────┐");
		System.out.println("│          메인메뉴         │");
		System.out.println("└────────────────────────┘");
		System.out.println("\t1.성적입력");
		System.out.println("\t2.성적출력");
		System.out.println("\t3.종료");
		System.out.println("\t선택>");
		int menu = scan.nextInt();
		
		return menu;

	}

}
