package stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {

//		try(InputStreamReader irs = new InputStreamReader(new FileInputStream("reader.txt") )) {
    	try(InputStreamReader irs = new InputStreamReader(System.in )) {

//		Socket socket = new Socket();
//		try(InputStreamReader irs = new InputStreamReader(socket.getInputStream() )) {				
			
			int i = 0;
			while(( i=irs.read()) != -1) {
				System.out.print((char)i);
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
