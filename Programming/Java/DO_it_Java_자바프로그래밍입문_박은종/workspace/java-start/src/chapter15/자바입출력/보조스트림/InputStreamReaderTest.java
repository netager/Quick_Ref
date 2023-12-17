package chapter15.자바입출력.보조스트림;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {

		// byte reader
//		try(FileInputStream fis = new FileInputStream("reader.txt")) {
		
		// 문자를 읽기위해 보조 스트림 사용
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
			int i = 0;
			while((i=isr.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
//		Socket socket = new Socket();
//		try {
//			InputStreamReader ir = new InputStreamReader(socket.getInputStream());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		

	}

}
