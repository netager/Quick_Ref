package part3.ex2.메소드;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		ExamList list = new ExamList();
		list.init();
		
		int menu;
		boolean keepLoop = true;
		
		while(keepLoop) {
			
			menu = inputMenu();
			
			switch(menu) {
			case 1:
				list.inputList();
				break;

			case 2:
				list.printList();
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
	
	static int inputMenu() {

		Scanner scan =  new Scanner(System.in);
		
		System.out.println("┌───────────────────┐");
		System.out.println("│       메인 메뉴      │");
		System.out.println("└───────────────────┘");
		System.out.println("\t1. 성적입력");
		System.out.println("\t2. 성적출력");
		System.out.println("\t3. 종료");
		System.out.println("\t>");
		
		int menu = scan.nextInt();
		
		return menu;

	}

}
