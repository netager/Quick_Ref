package part3.ex3.Getters��Setters_����1;

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
			System.out.printf("����:");
			math = scan.nextInt();
			
			if(math<0 || math>100)
				System.out.printf("��������(0~100)�� ������ϴ�.(%d)\n",math);
		} while(math<0 || math>100);

		Exam exam = new Exam(kor, eng, math);
		
>>>>>>> 5cfa87d906f0f669a44e55408cc6ff4b92468afa
		Exam[] exams = this.exams;
		int size = current;

		// ���� �迭 ����� 
		if(exams.length == size) {
			// 1. ũ�Ⱑ 5�� ���� �� ū ���ο� �迭 ���� 
			Exam[] temp = new Exam[exams.length + 5];
			// 2. ���� ���ֽ�Ű�� 
			for(int i=0; i<size; i++)
				temp[i] = exams[i];
			// 3. list.exams�� ���� ���� temp �迭�� �����ϵ��� �Ѵ�.
			exams = temp;
		} 
		
		exams[current] = exam;
		current++;
		
	}

}
