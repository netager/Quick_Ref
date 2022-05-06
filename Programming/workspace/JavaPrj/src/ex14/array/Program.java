package ex14.array;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		int[] kors = new int[3*3]; // 1차원 배열

		int total = 0;
		float avg;
		int menu;

		Scanner scan = new Scanner(System.in);	

//		kor1 = 0;
//		kor2 = 0;
//		kor3 = 0;
		
		for(int j=0; j<3; j++)
			for(int i=0; i<3; i++)
				kors[3*j+i] = 0;
		
		종료:
		while(true) {
			
			// ----- 메인 메뉴 부분 ------------------------------------
			System.out.println("┌────────────────────────┐");
			System.out.println("│          메인메뉴         │");
			System.out.println("└────────────────────────┘");
			System.out.println("\t1.성적입력");
			System.out.println("\t2.성적출력");
			System.out.println("\t3.종료");
			System.out.println("\t>");
			menu = scan.nextInt();
			
			switch(menu) {
			
			case 1:
				// ----- 성적 입력 부분 ------------------------------------
				System.out.println("┌────────────────────────┐");
				System.out.println("│          성적입력         │");
				System.out.println("└────────────────────────┘");
				
				for(int j=0; j<3; j++) 
					for(int i=0; i<3; i++)
						do {
							System.out.printf("%d학년 국어%d:", j+1, i+1);
							kors[3*j+i] = scan.nextInt();
							
							if(kors[3*j+i] <0 || kors[3*j+i]>100) {
								System.out.println("성적범위(0~100)을 벗어났습니다.");
							}
						} while(kors[3*j+i]<0 || kors[3*j+i]>100);
					
				break;
					
			
			case 2:
				// ----- 성적 출력 부분 ------------------------------------
		
				for(int j=0; j<3; j++) 
					for(int i=0; i<3; i++)
						total += kors[3*j+i];
				
				avg = total / 3f;
				
				System.out.println("┌────────────────────────┐");
				System.out.println("│          성적출력         │");
				System.out.println("└────────────────────────┘");
				
				for(int j=0; j<3; j++) {
					System.out.printf("<%d학년 국어성적>----------------\n", j+1);
					for(int i=0; i<3; i++)
						System.out.printf("\t국어%d : %3d\n", i+1, kors[3*j+i]);
				
					System.out.printf("\t총점  : %3d\n", total);
					System.out.printf("\t평균  : %6.2f\n", avg);
					System.out.printf("──────────────────────────\n");
				}
				break;
				
			case 3:
				break 종료;
			
			default:
				System.out.println("입력 오류 1 ~ 3 까지만 입력할 수 있습니다.");
			}
		}
		
		System.out.println("good bye ~");
	}
}