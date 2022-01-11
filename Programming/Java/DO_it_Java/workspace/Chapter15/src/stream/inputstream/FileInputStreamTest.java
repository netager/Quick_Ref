package stream.inputstream;

import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {

		FileReader fis = null;
		int i = 0;
		try {
			fis = new FileReader("input.txt");
			while( (i = fis.read()) != -1 ) {
				System.out.print((char)i);
			}
//		FileInputStream fis = null;
//		int i = 0;
//		try {
//			fis = new FileInputStream("input.txt");
//			while( (i = fis.read()) != -1) {
//				
//				System.out.print((char)i);
//			}
//			System.out.print((char)fis.read());
//			System.out.print((char)fis.read());
//			System.out.print((char)fis.read());
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			}catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}

}
