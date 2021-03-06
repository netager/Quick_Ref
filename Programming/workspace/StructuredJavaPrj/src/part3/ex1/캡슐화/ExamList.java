package part3.ex1.譫蓿??;

import java.util.Scanner;

public class ExamList {
	Exam[] exams;
	int current;
	
	static void printList(ExamList list) {
		printList(list, list.current);
	}
	
	static void printList(ExamList list, int size) {
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
		System.out.println("弛          撩瞳轎溘                    弛");
		System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
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
			
			
			System.out.printf("措橫 : %3d\n", kor);
			System.out.printf("艙橫 : %3d\n", eng);
			System.out.printf("熱з : %3d\n", math);
	
			System.out.printf("識薄  : %3d\n", total);
			System.out.printf("ゎ敕  : %6.2f\n", avg);
			System.out.println("式式式式式式式式式式式式式式式式式式式式式式式式式式");
		}
	}

	static void inputList(ExamList list) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
		System.out.println("弛          撩瞳殮溘                    弛");
		System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
		System.out.println();
		
		int kor, eng, math;
		
		do {
			System.out.printf("措橫:");
			kor = scan.nextInt();
			
			if(kor<0 || kor>100)
				System.out.printf("撩瞳彰嬪(0~100)擊 慇橫陬蝗棲棻.(%d)\n",kor);
		} while(kor<0 || kor>100);

		do {
			System.out.printf("艙橫:");
			eng = scan.nextInt();
			
			if(eng<0 || eng>100)
				System.out.printf("撩瞳彰嬪(0~100)擊 慇橫陬蝗棲棻.(%d)\n",eng);
		} while(eng<0 || eng>100);

		do {
			System.out.printf("熱з:");
			math = scan.nextInt();
			
			if(math<0 || math>100)
				System.out.printf("撩瞳彰嬪(0~100)擊 慇橫陬蝗棲棻.(%d)\n",math);
		} while(math<0 || math>100);

		Exam exam = new Exam();
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
		Exam[] exams = list.exams;
		int size = list.current;

		// 陛滲 寡翮 虜菟晦 
		if(exams.length == size) {
			// 1. 觼晦陛 5偃 薑紫 渦 贖 億煎遴 寡翮 儅撩 
			Exam[] temp = new Exam[exams.length + 5];
			// 2. 高擊 檜輿衛酈晦 
			for(int i=0; i<size; i++)
				temp[i] = exams[i];
			// 3. list.exams偃 億煎 虜萇 temp 寡翮擊 霤褻ж紫煙 и棻.
			list.exams = temp;
		} 
		
		list.exams[list.current] = exam;
		list.current++;
		
	}

	public static void init(ExamList list) {
		list.exams = new Exam[3];
		
	}

}
