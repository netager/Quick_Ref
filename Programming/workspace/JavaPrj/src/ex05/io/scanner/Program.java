package ex05.io.scanner;

import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;

		Scanner scan = new Scanner(System.in);	

		kor1 = 0;
		kor2 = 0;
		kor3 = 0;

		// ----- 성적 입력 부분 ------------------------------------
		System.out.println("┌────────────────────────┐");
		System.out.println("│          성적입력         │");
		System.out.println("└────────────────────────┘");
		System.out.print("국어1:");
		kor1 = scan.nextInt();
		System.out.print("국어2:");
		kor2 = scan.nextInt();
		System.out.print("국어3:");
		kor3 = scan.nextInt();
		
		
		// ----- 성적 출력 부분 ------------------------------------

//		avg = total / 3;    // 정수를 정수로 나누면 정수 부분만 나옴.
//		avg = total / 3.0;  // 타입이 같지 않은 연산을 안됨
//		avg = (float)total / 3.0;
//		avg = (float)(total / 3.0);
		
		total = kor1 + kor2 + kor3;
		avg = total / 3f;
		
		System.out.println("┌────────────────────────┐");
		System.out.println("│          성적출력         │");
		System.out.println("└────────────────────────┘");
		System.out.printf("\t국어1 : %3d\n", kor1);
		System.out.printf("\t국어2 : %3d\n", kor2);
		System.out.printf("\t국어3 : %3d\n", kor3);
		System.out.printf("\t총점  : %3d\n", total);
		System.out.printf("\t평균  : %6.2f\n", avg);
		System.out.printf("──────────────────────────");
		
	}

}