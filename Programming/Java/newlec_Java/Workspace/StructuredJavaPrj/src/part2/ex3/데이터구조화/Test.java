package part2.ex3.데이터구조화;

public class Test {
	public static void main(String[] args) {
		
		ExamList list = new ExamList();
		
		list.exams = new Exam[3];
		list.current = 0;
		
		inputList(list);
		
		printList(list);
		
	}
	
	static void inputList(ExamList list) {
		
		int kor, eng, math;
		
		for(int i=0; i<2; i++) {
			if (i == 0) {
				kor = 50;
		        eng = 50;
		        math = 50;
			}
			else {
				kor = 60;
				eng = 60;
				math = 60;
			}

			Exam exam = new Exam();

			exam.kor = kor;
			exam.eng = eng;
			exam.math = math;
			
			list.exams[i] = exam;
			list.current++;
			
			for(int i1=0; i1<list.current; i1++) {

				System.out.printf("index: %d, kor: %d ", i1, list.exams[i1].kor);
				System.out.println();
				System.out.println("--------------------------------------------------------");
			}
			

			
		}
		
		System.out.println("=======================================================");
		System.out.printf("current: %d, kor: %d\n", list.current, list.exams[0].kor);
		System.out.printf("current: %d, kor: %d\n", list.current, list.exams[1].kor);
		System.out.println("=======================================================");

	}
	
	
	static void printList(ExamList list) {
		
		Exam exam = new Exam();
		int kor, eng, math;
		
		System.out.printf("current: %d, kor: %d \n", list.current, list.exams[0].kor);
		System.out.printf("current: %d, kor: %d ", list.current, list.exams[1].kor);
		System.out.println();

		for(int i=0; i<list.current; i++) {
			exam = list.exams[i];
			
			kor = exam.kor;
			eng = exam.eng;
			math = exam.math;
			
			System.out.printf("index: %d, kor: %d ", i, kor);
			System.out.println();
			
			System.out.printf("kor : %d ", kor);
			System.out.printf("eng : %d ", eng);
			System.out.printf("math : %d ", math);
			System.out.println();
		}
		
		
	}

}
