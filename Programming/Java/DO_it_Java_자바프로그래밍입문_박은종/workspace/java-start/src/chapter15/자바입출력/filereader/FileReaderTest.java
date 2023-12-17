package chapter15.자바입출력.filereader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		FileReader fis = null;


		// File의 끝까지 읽기
		int i = 0;
		try {
			 fis = new FileReader("input.txt");	// default characterset : utf8
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
