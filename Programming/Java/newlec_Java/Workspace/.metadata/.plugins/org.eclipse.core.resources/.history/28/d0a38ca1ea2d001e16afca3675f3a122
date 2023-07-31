package part2.ex3.데이터구조화;

import java.util.Scanner;

public class ListProgram {

	public static void main(String[] args) {
		
		ExamList list = new ExamList();
		list.exams = new Exam[3];
		list.current = 0;
		
        int menu;
        boolean keepLoop = true;

        while(keepLoop) {

            menu = inputMenu();

            switch (menu) {
	        case 1:
	        	
	        	inputList(list);
	        	break;
	        
	        case 2:
	        	printList(list);
		        break;
		        
	        case 3: 
	            System.out.println("Good Bye ~");
	            keepLoop = false;
	        	break;
	        
	        default:
	        	System.out.println("[입력 오류] 1~3 까지만 입력할 수 있습니다.");
	        	
	        } //switch
	        
	    } // while

	}
	
	static int inputMenu() {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("┌────────────────────┐");
        System.out.println("│                메인 메뉴               │");
        System.out.println("└────────────────────┘");
        System.out.println("\t1. 성적입력");
        System.out.println("\t2. 성적출력");
        System.out.println("\t3. 종료");
        System.out.print("\t>");
        int menu = scan.nextInt();
        
        return menu;
    }
	
	static void inputList(ExamList list) {

        Scanner scan = new Scanner(System.in);

        System.out.println("┌────────────────────┐");
        System.out.println("│                성적 입력               │");
        System.out.println("└────────────────────┘");
        System.out.println();

        

        int kor, eng, math;
        
    	do {
        	System.out.printf("국어: ");
          	kor = scan.nextInt();
          	
            if (kor<0 || 100<kor)
            	System.out.println("성적범위(0~100)를 벗어났습니다.");
            
    	} while (kor<0 || 100<kor);
    	
    	do {
        	System.out.printf("영어: ");
          	eng = scan.nextInt();
          	
            if (eng<0 || 100<eng)
            	System.out.println("성적범위(0~100)를 벗어났습니다.");
            
    	} while (eng<0 || 100<eng);
    	
    	do {
        	System.out.printf("수학: ");
          	math = scan.nextInt();
          	
            if (math<0 || 100<math)
            	System.out.println("성적범위(0~100)를 벗어났습니다.");
            
    	} while (math<0 || 100<math);
    	
    	Exam exam = new Exam();

    	exam.kor = kor;
    	exam.eng = eng;
    	exam.math = math;
    	
    	if(list.exams.length == list.current) {
    		ExamList temp
    		list.exams
    	}
    	
    	list.exams[list.current] = exam;
    	list.current++;
    	

	}
	
	static void printList(ExamList list) {
    	
	    System.out.println("┌────────────────────┐");
	    System.out.println("│                성적 출력               │");
	    System.out.println("└────────────────────┘");
	    System.out.println();
	    
	    int size = list.current;
	    Exam[] exams = list.exams;
	    
	    for (int i=0; i<size; i++) {
	    	
	    	Exam exam = exams[i];
	    	
	    	int kor = exam.kor;
		    int eng = exam.eng;
		    int math = exam.math;
		    
		    int total = kor + eng + math;
		    float avg = total / 3.0f;
		    
	    	System.out.printf("\t국어 : %d\n", kor);
	    	System.out.printf("\t영어 : %d\n", eng);
	    	System.out.printf("\t수학 : %d\n", math);
	
		    System.out.printf("\t총점    : %d\n", total);
		    System.out.printf("\t평균    : %6.2f\n", avg);
		    System.out.printf("─────────────────────\n");
	    }
    }
}