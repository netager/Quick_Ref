package ex06_01.consoleinout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

		InputStream in = System.in;
//				
//		byte[] a = new byte[3];
//
//		in.read(a);
//
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);

		InputStreamReader reader = new InputStreamReader(in);
//
//		char[] b = new char[3];
//		reader.read(b);
//
//		
//		for (int i = 0; i < b.length; i++)
//			System.out.printf("%c%n", b[i]);

		BufferedReader br = new BufferedReader(reader);
		String c = br.readLine();
		System.out.println(c);
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.next());
		
	}

}
