package part3.ex4.UI�ڵ�и��ϱ�;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		ExamConsole list = new ExamConsole();
		
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
				System.out.println("�Է� ���� 1~3 ������ �Է��� �� �ֽ��ϴ�.");
			}
		}

	}
	
	static int inputMenu() {

		Scanner scan =  new Scanner(System.in);
		
		System.out.println("������������������������������������������");
		System.out.println("��       ���� �޴�      ��");
		System.out.println("������������������������������������������");
		System.out.println("\t1. �����Է�");
		System.out.println("\t2. �������");
		System.out.println("\t3. ����");
		System.out.println("\t>");
		
		int menu = scan.nextInt();
		
		return menu;

	}

}
