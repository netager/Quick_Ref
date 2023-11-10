package part2.ex1.성적입력부분나누기;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		int total;
		float avg;
		int menu;
		boolean keepLoop = true;
		int[] kors = new int[3];
		
		Scanner scan =  new Scanner(System.in);

		while(keepLoop) {
			
			//--- 메인 메뉴 부분 ----------------------------------
			System.out.println("┌───────────────────┐");
			System.out.println("│       메인 메뉴      │");
			System.out.println("└───────────────────┘");
			System.out.println("\t1. 성적입력");
			System.out.println("\t2. 성적출력");
			System.out.println("\t3. 종료");
			System.out.println("\t>");
			
			menu = scan.nextInt();
			
			switch(menu) {

			case 1:
				//--- 성적 입력 부분 ----------------------------------
				System.out.println("┌───────────────────┐");
				System.out.println("│       성적 입력      │");
				System.out.println("└───────────────────┘");

				for(int i=0; i<3; i++) {
					do {
						System.out.printf("국어%d :", i+1);
						kors[i] = scan.nextInt();
						
						if (kors[i] < 0 || 100 < kors[i])
							System.out.println("성적범위(0~100)를 벗어났습니다.");
					} while(kors[i] < 0 || 100 < kors[i]);
				}
				break;

			case 2:
				//--- 성적 출력 부분 ----------------------------------
				total = 0;
				
				for(int i=0; i<3; i++)
					total += kors[i];
				avg = total / 3.0f;
		
				System.out.println("┌───────────────────┐");
				System.out.println("│       성적 출력      │");
				System.out.println("└───────────────────┘");
		
				for (int i=0; i<3; i++)
					System.out.printf("\t국어%d : %3d\n", i+1, kors[i]);
				
				System.out.printf("\t총점 : %3d\n", total);
				System.out.printf("\t평균 : %6.9f\n", avg);
				System.out.println("─────────────────────");
				break;
				
			case 3:
				System.out.println("Good Bye ~~~");
				
				keepLoop = false;
				break;
				
			default:
				System.out.println("입력 오류 1~3 까지만 입력할 수 있습니다.");
			}
	
		}

	}
}