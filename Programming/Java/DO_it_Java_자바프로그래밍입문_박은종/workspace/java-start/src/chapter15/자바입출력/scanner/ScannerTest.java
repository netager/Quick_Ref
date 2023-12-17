package chapter15.자바입출력.scanner;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		
		int num = scanner.nextInt();
		System.out.println(name);
		System.out.println(num);

	}

}
