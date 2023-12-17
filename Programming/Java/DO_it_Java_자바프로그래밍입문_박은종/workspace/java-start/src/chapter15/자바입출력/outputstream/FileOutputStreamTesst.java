package chapter15.자바입출력.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTesst {

	public static void main(String[] args) {

		byte[] bs = new byte[26];
		byte data = 65;
		for(int i=0; i<bs.length; i++) {
			bs[i] = data++;
		}
//		try(FileOutputStream fos = new FileOutputStream("output2.txt", true)) {  // true - append, false - overwrite
		try(FileOutputStream fos = new FileOutputStream("output2.txt", false)) {  // true - append, false - overwrite
			fos.write(65);	// 숫자에 대응되는 문자를 출력  
			fos.write(66);
			fos.write(67);
			fos.write('\n');
			fos.write(bs);
			fos.write('\n');
			fos.write(bs, 2, 10);
			
		} catch(IOException e) {
			System.out.println(e);
			
		}
		System.out.println("End");

	}

}
