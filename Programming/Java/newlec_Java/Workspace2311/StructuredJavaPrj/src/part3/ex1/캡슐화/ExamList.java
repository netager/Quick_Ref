package part3.ex1.譫蓿��;

import java.util.Scanner;

public class ExamList {
	
	Exam[] exams;
	int current;
	
	static void inputList(ExamList list) {
		Scanner scan =  new Scanner(System.in);

		System.out.println("忙式式式式式式式式式式式式式式式式式式式忖");
		System.out.println("弛       撩瞳 殮溘      弛");
		System.out.println("戌式式式式式式式式式式式式式式式式式式式戎");
		System.out.println();
		
		int kor, eng, math;
	
		do {
			System.out.printf("措橫 :");
			kor = scan.nextInt();
			
			if (kor < 0 || 100 < kor)
				System.out.println("撩瞳彰嬪(0~100)蒂 慇橫陬蝗棲棻.");
		} while(kor < 0 || 100 < kor);

		do {
			System.out.printf("艙橫 :");
			eng = scan.nextInt();
			
			if (eng < 0 || 100 < eng)
				System.out.println("撩瞳彰嬪(0~100)蒂 慇橫陬蝗棲棻.");
		} while(eng < 0 || 100 < eng);

		do {
			System.out.printf("熱з :");
			math = scan.nextInt();
			
			if (math < 0 || 100 < math)
				System.out.println("撩瞳彰嬪(0~100)蒂 慇橫陬蝗棲棻.");
		} while(math < 0 || 100 < math);

		System.out.println("式式式式式式式式式式式式式式式式式式式式式");
		
		Exam exam = new Exam();
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
		Exam[] exams = list.exams;
		int size = list.current;
		
		if(exams.length == size) {
			Exam[] temp = new Exam[exams.length+5];
			
			for(int i=0; i<size;i++)
				temp[i] = exams[i];
			list.exams = temp;
		}
		
		list.exams[list.current] = exam;
		list.current++;
	}

	
	static void printList(ExamList list) {
		printList(list, list.current);
		
	}
	
	static void printList(ExamList list, int size) {
		
		System.out.println("忙式式式式式式式式式式式式式式式式式式式忖");
		System.out.println("弛       撩瞳 轎溘      弛");
		System.out.println("戌式式式式式式式式式式式式式式式式式式式戎");
		System.out.println();
		
//		int size = list.current;
		Exam[] exams = list.exams;
		
		for(int i=0; i<size; i++) {
			Exam exam = exams[i];
		
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;
			
			int total = kor + eng + math;
			float avg = total/3.0f; 
				
			System.out.printf("措橫 : %3d\n", kor);
			System.out.printf("艙橫 : %3d\n", eng);
			System.out.printf("熱з : %3d\n", math);
			
			System.out.printf("識薄 : %3d\n", total);
			System.out.printf("ゎ敕 : %6.9f\n", avg);
			System.out.println("式式式式式式式式式式式式式式式式式式式式式");
		}
	}


	
	public static void init(ExamList list) {
		
		list.exams = new Exam[3];
		list.current = 0;
		
	}


}
