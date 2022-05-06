package part2.ex1.성적입력부분나누기;

import java.util.Scanner;

public class StructuredProgram {
	
	public static void main(String[] args) {

		int[] korList = new int[3];
		int menu;
		boolean keepLoop = true;

		while(keepLoop) {
			
			menu = inputMenu(); 
			
			switch(menu) {
			case 1:
				inputKors(korList);
				break;
			
			case 2:
				printKors(korList);
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

	
	static int inputMenu() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌────────────────────────┐");
		System.out.println("│          메인메뉴         │");
		System.out.println("└────────────────────────┘");
		System.out.println("\t1.성적입력");
		System.out.println("\t2.성적출력");
		System.out.println("\t3.종료");
		System.out.println("\t선택>");
		int menu = scan.nextInt();
		
		return menu;

	}
	
	
	static void inputKors(int[] kors) {
		
		Scanner scan = new Scanner(System.in);
		int kor;

		System.out.println("┌────────────────────────┐");
		System.out.println("│          성적입력         │");
		System.out.println("└────────────────────────┘");
		System.out.println();
		
		for(int i=0; i<3; i++) {
			do {
				System.out.printf("국어%d:", i+1);
				kor = scan.nextInt();
				
				if(kor<0 || kor>100)
					System.out.printf("성적범위(0~100)을 벗어났습니다.(%d)\n",kor);
			} while(kor<0 || kor>100);
			
			kors[i] = kor;
		}
		
		System.out.println("──────────────────────────");
		
	}

	
	static void printKors(int[] kors) {

		int total = 0;
		float avg;
		
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
	}

}
