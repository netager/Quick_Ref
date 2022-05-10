package part3.ex5.추상화;

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


	public int size() {
		return current;
	}
	
}
