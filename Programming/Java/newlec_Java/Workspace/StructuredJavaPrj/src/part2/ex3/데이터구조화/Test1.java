package part2.ex3.데이터구조화;

public class Test1 {

	public static void main(String[] args) {
		
		Exam[] exams = new Exam[3];
		
		for(int i=0; i<exams.length; i++) {
			Exam exam = new Exam();
			
			if (i == 0) {
				exam.kor = 1;
				exam.eng = 1;
				exam.math = 1;
			}
			else if(i == 1) {
				exam.kor = 2;
				exam.eng = 2;
				exam.math = 2;
			}
			else {
				exam.kor = 3;
				exam.eng = 3;
				exam.math = 3;
				
			}
				
			exams[i] = exam;
		}
		
	
		for(int i=0; i<exams.length; i++) {
			Exam exam = new Exam();			
			exam = exams[i];

			System.out.printf("kor%d: %d\n", i, exam.kor);
			System.out.printf("eng%d: %d\n", i, exam.math);
			System.out.printf("math%d: %d\n", i, exam.math);
			System.out.println("----------------------");
		}
			
	}

}
