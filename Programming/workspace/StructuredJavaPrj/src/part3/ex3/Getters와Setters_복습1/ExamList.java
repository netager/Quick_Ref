package part3.ex3.Getters와Setters_복습1;

import java.util.Scanner;

public class ExamList {
	private Exam[] exams;
	private int current;
	
	
	public ExamList() {
		this(3);
	}
	
	public ExamList(int size) {
		exams = new Exam[size];
		current = 0;
	}
	
	public Exam get(int i) {
		// TODO Auto-generated method stub
		return this.exams[i];
	}

<<<<<<< HEAD
	public void add(Exam exam) {
=======
		do {
			System.out.printf("수학:");
			math = scan.nextInt();
			
			if(math<0 || math>100)
				System.out.printf("성적범위(0~100)을 벗어났습니다.(%d)\n",math);
		} while(math<0 || math>100);

		Exam exam = new Exam(kor, eng, math);
		
>>>>>>> 5cfa87d906f0f669a44e55408cc6ff4b92468afa
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

}
