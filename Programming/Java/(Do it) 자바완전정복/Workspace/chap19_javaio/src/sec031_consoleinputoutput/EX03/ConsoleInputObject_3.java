package sec031_consoleinputoutput.EX03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ConsoleInputObject_3 {
	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in;
		
		//#2. n-byte 단위 읽기
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1);
		
		String str1 = new String(byteArray1, 0, count1, Charset.defaultCharset());
		System.out.println(str1);
		
		//#3. 
		byte[] byteArray2 = new byte[100];
		int offset=3;
		int length=6;
		int count2 = is.read(byteArray2, offset, length);
				
		String str2 = new String(byteArray2, 0, offset+count2, Charset.defaultCharset());
//		String str2 = new String(byteArray2, offset, count2, Charset.defaultCharset());
		System.out.println(str2);
		
	}

}
