package part2.ex2.탑다운예제;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int[][] lottos = null;
		int menu;
		boolean running = true;
		
		while(running) {
			menu = inputMenu();
			
			switch(menu) {
			case 1:
				lottos = createLottosAuto();
				break;
			case 2:
				lottos = createLottosManual();
				break;
			case 3:
				printLottos(lottos);
				break;
			case 4:
				running = false;
				break;
			default:	
				break;
			}
		}

	}

	private static int[][] createLottosAuto() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void printLottos(int[][] lottos) {
		// TODO Auto-generated method stub
		
	}

	private static int[][] createLottosManual() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int inputMenu() {
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

}
