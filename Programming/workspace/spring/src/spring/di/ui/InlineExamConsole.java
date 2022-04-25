package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;


public class InlineExamConsole implements ExamConsole {
	@Autowired(required = false)
	@Qualifier("exam2")
	private Exam exam;


	public InlineExamConsole() {
		System.out.println("constructor");
	}


	public void InlineConsole(Exam exam) {
		System.out.println("overloaded constructor");
		this.exam = exam;
	}
	
	
	@Override
	public void print() {
		
		if(exam == null)
			System.out.printf("total : %3d, avg : %3.2f\n", 0, 0.0);
		else
			System.out.printf("total : %3d, avg : %3.2f\n", exam.total(), exam.avg());
	
	}
	

	@Override
	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam = exam;
	}	
}
