package ex10.control2.for_example;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int total = 0;
		
		for (int i=0; i<5; i++) {  // 3~7 더하기
			total += i+3;
		}
		
		System.out.printf("total is %d\n", total);
		
		// 합을 구하는 공식
		// ----------
		// Sn = n(2a + (n-1)d)/2
		// Sn = n(a+l)/2, n:공차, a:초항, l:말항
		
		total = 5 * (3+7) / 2;
		System.out.printf("total is %d\n", total);
		
	}
}