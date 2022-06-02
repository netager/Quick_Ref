package sec05_readerwriter.EX04;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReader_2 {
	public static void main(String[] args) {
		
		//#1. 콘솔입력(UTF-8)
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
			int data;
			while((data=isr.read()) != '\r') {
				System.out.print((char)data);
			}
			System.out.println("\n" + isr.getEncoding());
		} catch (IOException e) {}

		//#2. 콘솔입력(MS949)
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "MS949");
			int data;
			while((data=isr.read()) != '\r') {
				System.out.print((char)data);
			}
			System.out.println("\n" + isr.getEncoding());
		} catch (IOException e) {}

	}

}
