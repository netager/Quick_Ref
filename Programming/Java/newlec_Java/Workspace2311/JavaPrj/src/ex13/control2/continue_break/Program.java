package ex13.control2.continue_break;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int n = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� space�� �����ؼ� 5�� �̻� �Է��ϼ���:");
		
		while (scan.hasNext()) {
			n = scan.nextInt(); // 3 Enter, 34 5 6 234 345 54 45 Enter
			if ( n<10)
				continue;
			
			if (n>200)
				break;
			
			System.out.println(n);
		}
		
	}
}