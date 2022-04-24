package spring.di.ui;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	
	private Exam exam;


	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
	}
	
	public void InlineConsole(Exam exam) {
	
		this.exam = exam;
	}
	
	
	@Override
	public void print() {
		
		
		System.out.printf("total : %3d, avg : %3.2f\n", exam.total(), exam.avg());
	
	}
	
	
	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		this.exam = exam;
	}	
}
