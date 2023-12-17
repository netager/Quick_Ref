package chapter15.�ڹ������.������Ʈ��.bufferedstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class BufferedInputStreamReaderTest {

	public static void main(String[] args) {

		// byte reader
//		try(FileInputStream fis = new FileInputStream("reader.txt")) {
		
		// ���ڸ� �б����� ���� ��Ʈ�� ���
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
			int i = 0;
			while((i=isr.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		Socket socket = new Socket();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			br.readLine();
		} catch(IOException e) {
			System.out.println(e);
		}

	}

}
