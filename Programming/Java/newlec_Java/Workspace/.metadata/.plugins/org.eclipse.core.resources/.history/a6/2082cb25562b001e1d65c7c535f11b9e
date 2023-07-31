package ex15.marray;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        
        int[][] kors = new int[3][3];
        int total;
        float avg;
        int menu;
        
        Scanner scan = new Scanner(System.in);

        // 배열 초기화
        for(int j=0; j<3; j++)
        	for(int i=0; i<3; i++)
        		kors[j][i] = 0;

                  종료:
        while(true) {
            //----- 메인 메뉴 부분 ----------------------
	        System.out.println("┌────────────────────┐");
	        System.out.println("│        메인 메뉴                 │");
	        System.out.println("└────────────────────┘");
	        System.out.println("\t1. 성적입력");
	        System.out.println("\t2. 성적출력");
	        System.out.println("\t3. 종료");
	        System.out.print("\t>");
	        menu = scan.nextInt();
	        
	        switch (menu) {
	        
	        case 1:
	        	//----- 성적 입력 부분 ----------------------
		        System.out.println("┌────────────────────┐");
		        System.out.println("│        성적 입력                 │");
		        System.out.println("└────────────────────┘");

		        for(int j=0; j<3; j++)
			        for(int i=0; i<3; i++)
				        do {
				            System.out.printf("%d학년 국어%d:", j+1, i+1);
				            kors[j][i] = scan.nextInt();
				            
				            if (kors[j][i]<0 || 100<kors[j][i])
				            	System.out.println("성적범위(0~100)를 벗어났습니다.");
				        } while(kors[j][i]<0 || 100<kors[j][i]);

		        break;
		        
	        case 2:
		        //----- 성적 출력 부분 ----------1------------
		        System.out.println("┌────────────────────┐");
		        System.out.println("│        성적 출력                 │");
		        System.out.println("└────────────────────┘");
		        
		        for (int j=0; j<3; j++) {
		        	total = 0;
		        	System.out.printf("<%d학년 국어성적> ----------\n", j+1);
		        	
			        for (int i=0; i<3; i++) {
			        	System.out.printf("\t국어%d : %3d\n", i+1, kors[j][i]);
			        	total += kors[j][i];
			        }
			        
			        avg = total / 3.0f;
			        System.out.printf("\t총점    : %3d\n", total);
			        System.out.printf("\t평균    : %6.2f\n", avg);
			        System.out.printf("─────────────────────\n");
		        }
		        
		        break;
		        
	        case 3: 
	        	break 종료;
	        
	        default:
	        	System.out.println("[입력 오류] 1~3 까지만 입력할 수 있습니다.");
	        	
	        } //switch
	        
	    } // while
        
        System.out.println("Good Bye~");
    } // main
} // class