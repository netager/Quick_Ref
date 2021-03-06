package part2.ex1.성적입력부분나누기;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int[] kors = new int[3];

		int total = 0;
		float avg;
		int menu;
		boolean keepLoop = true;

		Scanner scan = new Scanner(System.in);	

		while(keepLoop) {
			
			System.out.println("┌────────────────────────┐");
			System.out.println("│          메인메뉴         │");
			System.out.println("└────────────────────────┘");
			System.out.println("\t1.성적입력");
			System.out.println("\t2.성적출력");
			System.out.println("\t3.종료");
			System.out.println("\t선택>");
			menu = scan.nextInt();
			
			switch(menu) {
			
			case 1:
				// ----- 성적 입력 부분 ------------------------------------
				System.out.println("┌────────────────────────┐");
				System.out.println("│          성적입력         │");
				System.out.println("└────────────────────────┘");
				System.out.println();
				
				for(int i=0; i<3; i++)
					do {
						System.out.printf("국어%d:", i+1);
						kors[i] = scan.nextInt();
						
						if(kors[i]<0 || kors[i]>100)
							System.out.println("성적범위(0~100)을 벗어났습니다.");
					} while(kors[i]<0 || kors[i]>100);	
				
				System.out.println("──────────────────────────");
				
				break;
					
			
			case 2:
				// ----- 성적 출력 부분 ------------------------------------
		

				for(int i=0; i<3; i++)
					total += kors[i];
				
				avg = total / 3.0f;
				
				System.out.println("┌────────────────────────┐");
				System.out.println("│          성적출력         │");
				System.out.println("└────────────────────────┘");
				System.out.println();
				
				for(int i=0; i<3; i++)
					System.out.printf("국어 %d : %3d\n", 3-i, kors[i]);
					
				System.out.printf("총점  : %3d\n", total);
				System.out.printf("평균  : %6.2f\n", avg);
				System.out.println("──────────────────────────");
			
				break;
				
			case 3:
				System.out.println("Bye ~~~");
				
				keepLoop = false;
				break;
			
			default:
				System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지 입니다.");
			}
		}
		
		System.out.println("good bye ~");


	}

}
