package part3.ex4.UI코드분리하기;

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

		return exams[i];
	}

	
	public void add(Exam exam) {

		Exam[] exams = this.exams;
		int size = this.current;
		
		if(exams.length == size) {
			Exam[] temp = new Exam[exams.length+5];
			
			for(int i=0; i<size;i++)
				temp[i] = exams[i];
			this.exams = temp;
		}
		
		exams[this.current] = exam;
		current++;

		
	}


	
	
	public int size() {
		// TODO Auto-generated method stub
		return current;
	}





}

