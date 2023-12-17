package chapter15.자바입출력.보조스트림;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyInOutputStreamTest {

	public static void main(String[] args) {
		
		long milliseconds = 0;
		int len = 0;
		
		try(FileInputStream fis = new FileInputStream("a.exe");
			FileOutputStream fos = new FileOutputStream("b.exe");
				) {
			
			milliseconds = System.currentTimeMillis();
			int i = 0;
			while((i = fis.read()) != -1) {
				
				fos.write(i);
				len++;
//				System.out.print((char)i);
			}
			milliseconds = System.currentTimeMillis() - milliseconds;
				
		} catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("--------------------------");
		System.out.println(len);
		System.out.println(milliseconds);

	}

}
