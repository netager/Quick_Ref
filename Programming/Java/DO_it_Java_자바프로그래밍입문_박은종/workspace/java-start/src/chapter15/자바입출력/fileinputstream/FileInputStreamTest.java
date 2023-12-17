package chapter15.자바입출력.fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			 fis = new FileInputStream("input.txt");
			
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
//				e.printStackTrace();
//			} catch (NullPointerException e) {
//				System.out.println(e);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("End");
		System.out.println("--------------------------");
		

		// File의 끝까지 읽기
		int i = 0;
		try {
			 fis = new FileInputStream("input.txt");
			 while((i = fis.read()) != -1) 
				 System.out.print((char)i);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("End");

		

	}
}
