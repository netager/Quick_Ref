package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/* 스프링에게 지시하는 방법으로 코드를 변경  
		Exam exam = new NewlecExam();
		
//		exam.setKor(10);
//		exam.setEng(10);
//		exam.setMath(10);
//		exam.setCom(10);
//		
		
//		ExamConsole console = new InlineExamConsole(exam);
		ExamConsole console = new GridExamConsole(exam);
//		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam);
		console.print();
		
		*/
//		ApplicationContext context = 
//				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		ApplicationContext context =
				new AnnotationConfigApplicationContext(NewlecDIConfig.class);
				
//		Exam exam = context.getBean(Exam.class);
//			System.out.println(exam.toString());
		
		ExamConsole console = (ExamConsole) context.getBean("console");
//		ExamConsole console = context.getBean(ExamConsole.class);  // 자료형명을 이용하여 사용
		console.print();
		
//		List<Exam> exams = new ArrayList<>();
//		List<Exam> exams = (List<Exam>) context.getBean("exams");
//		exams.add(new NewlecExam(1,1,1,1));
		
//		for(Exam e : exams)
//			System.out.println(e);

	}

}
