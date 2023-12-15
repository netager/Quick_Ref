package ex07_04.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program { 	

	public void shouldBeRun() {
		System.out.println("ok thanks.");
	}

	public static void main(String[] args) throws IOException {
		
//		BufferedReader br = new BufferedReader(new FileReader("나없는파일"));
//		br.readLine();
//		br.close();
	
//		int c;
//		
//		try {
//			c = 4 / 0;
//		} catch(ArithmeticException e) {
//			c = -1;
//		}
		
		
		
//		int[] a = {1,2,3};
//		System.out.println(a[3]);
//
		
		Program program = new Program();
		
		int c;
		
		try {
			c = 4 / 0;
			program.shouldBeRun();

		} catch(ArithmeticException e) {
			c = -1;
		} finally {
			program.shouldBeRun();
		}
		
	}
	
}
