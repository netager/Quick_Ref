package ex16.star;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<10; j++)
//				System.out.printf("%c", '¡Ù');
//		    System.out.println();
//		}

		for(int i=0; i<10; i++) {
			for(int j=0; j<i+1; j++)
				System.out.printf("%c", '¡Ù');
		    System.out.println();
		}

		for(int i=0; i<10; i++) {
			for(int j=0; j<10-i; j++)
				System.out.printf("%c", '¡Ù');
		    System.out.println();
		}
		
		for(int i=0; i<26; i++)
	 		System.out.printf("%c,", 65+i);
	 	System.out.println();	
	 	

	 	for(int i=0; i<26; i++)	 	
	 		System.out.printf("%c,", 'A'+i);
	 	System.out.println();	 	
	 	
	 	for(int n=1; n<=5; n++)
	 		System.out.printf("%d ", 1+(n-1)*5);
	 	
	 	System.out.println();
	 	for(int n=1; n<=5; n++)
	 		if(n != 5)
	 			System.out.printf("%d, ", 1+(n-1)*5);
	 		else
	 			System.out.printf("%d\n", 1+(n-1)*5);

	 	for(int n=1; n<=5; n++)
	 		if(n != 5)
	 			System.out.printf("%d, ", 1+(n-1)*5);
	 		else
	 			System.out.printf("%d\n", 1+(n-1)*5);

	}
}