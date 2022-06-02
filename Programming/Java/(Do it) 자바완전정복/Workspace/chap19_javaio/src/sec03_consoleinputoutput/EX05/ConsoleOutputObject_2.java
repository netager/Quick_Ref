package sec03_consoleinputoutput.EX05;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class ConsoleOutputObject_2 {
	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;
		
		//#2. n-byte 단위 쓰기
		byte[] byteArray1 = "abc안녕하세요".getBytes(Charset.forName("UTF-8"));
		os.write(byteArray1);
		os.write('\n');
		os.flush();
		
		
		//#3. n-byte 단위 쓰기
		byte[] byteArray2 = "adfddbc반갑습니다".getBytes(Charset.defaultCharset());
		os.write(byteArray2, 6, 6);
		os.write('\n');
		os.flush();

	}	
}
