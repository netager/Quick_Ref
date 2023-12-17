package chapter15.자바입출력.보조스트림.bufferedstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyBufferedStreamTest {

	public static void main(String[] args) {
		
		long milliseconds = 0;
		int len = 0;
		
		try(FileInputStream fis = new FileInputStream("a.exe");
			FileOutputStream fos = new FileOutputStream("b.exe");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			
			milliseconds = System.currentTimeMillis();
			int i = 0;
			while((i = bis.read()) != -1) {
				
				bos.write(i);
				len++;
//				System.out.print((char)i);
			}
			milliseconds = System.currentTimeMillis() - milliseconds;
				
		} catch(IOException e) {
			System.out.println(e);
		}
		System.out.println(len);
		System.out.println(milliseconds);

	}

}
