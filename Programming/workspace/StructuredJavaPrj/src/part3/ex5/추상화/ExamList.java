package part3.ex5.�߻�ȭ;

public class ExamList {
	private Exam[] exams;
	private int current;
	
	public ExamList() {
		exams = new Exam[3];
		current = 0;
	}
	

	public Exam get(int i) {
		return  this.exams[i];
	}

	
	public void add(Exam exam) {
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


	public int size() {
		return current;
	}
	
}
