package sec05_readerwriter.EX05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriter_1 {
	public static void main(String[] args) {
		
		//#1. FileWriter를 이용하여 데이터 쓰기(디폴트(UTF-8))
		File outputStreamWriter1 = new File("src/sec05_readerwriter/files/OutputStreamReader1.txt");
				
		try(Writer writer = new FileWriter(outputStreamWriter1);) {
			writer.write("OutputStreamWriter1 예제파일입니다.\n".toCharArray());
			writer.write("한글과 영문이 모두 포함되어 있습니다.");
			writer.write('\n');
			writer.write("Good Bye!!!\n\n");
			writer.flush();
		} catch(IOException e) {}
		
		
		//#2. FileWriter를 이용하여 데이터 쓰기(디폴트(UTF-8) --> MS949 파일 생성)
		//파일객체 생성
		File outputStreamWriter2 = new File("src/sec05_readerwriter/files/OutputStreamReader2.txt");
				
		try(OutputStream os = new FileOutputStream(outputStreamWriter2, false);
				OutputStreamWriter ow = new OutputStreamWriter(os,"MS949");) {

			ow.write("OutputStreamWriter2 예제파일입니다.\n".toCharArray());
			ow.write("한글과 영문이 모두 포함되어 있습니다.");
			ow.write('\n');
			ow.write("Good Bye!!!\n\n");
			ow.flush();
		} catch(IOException e) {}
		
		
	}
}
