package part2.ex1.성적입력부분나누기;

import java.util.Scanner;

public class StructuredProgram {
	
	
	public static void main(String[] args) {

		int[] korList = new int[3];
        int menu;
        boolean keepLoop = true;
        

        while(keepLoop) {

            menu = inputMenu();

            switch (menu) {
	        case 1:
	        	
	        	inputKors(korList);
	        	break;
	        
	        case 2:
	        	printKors(korList);
		        break;
		        
	        case 3: 
	            System.out.println("Good Bye ~");
	            keepLoop = false;
	        	break;
	        
	        default:
	        	System.out.println("[입력 오류] 1~3 까지만 입력할 수 있습니다.");
	        	
	        } //switch
	        
	    } // while
        

    } // main
    

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


    static void inputKors(int[] kors) {

        Scanner scan = new Scanner(System.in);
        int kor;
        
        System.out.println("┌────────────────────┐");
        System.out.println("│                성적 입력               │");
        System.out.println("└────────────────────┘");
        System.out.println();
       
        for(int i=0; i<kors.length; i++) {
        	do {
	        	System.out.printf("국어%d:", i+1);
	          	kor = scan.nextInt();
	          	
	            if (kor<0 || 100<kor)
	            	System.out.println("성적범위(0~100)를 벗어났습니다.");
	            
        	} while (kor<0 || 100<kor);
        	
        	kors[i] = kor;
	            
        }
 

    }

    
    static void printKors(int[] kors) {
    	
    	int total = 0;
    	float avg;
    	
	    for (int i=0; i<kors.length; i++)
	    	total += kors[i];
	    
	    avg = total/3.0f;
	    		        
	    System.out.println("┌────────────────────┐");
	    System.out.println("│                성적 출력               │");
	    System.out.println("└────────────────────┘");
	    
	    for (int i=0; i<kors.length; i++)
	    	System.out.printf("\t국어%d : %3d\n", i+1, kors[i]);
	
	    
	    System.out.printf("\t총점    : %3d\n", total);
	    System.out.printf("\t평균    : %6.2f\n", avg);
	    System.out.printf("─────────────────────\n");
    }
	    
} // class