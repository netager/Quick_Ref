package part3.ex4.UI�ڵ�и��ϱ�_����1;

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
		return this.exams[i];
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
