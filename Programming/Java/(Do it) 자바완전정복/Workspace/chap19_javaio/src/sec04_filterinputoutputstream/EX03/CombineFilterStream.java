package sec04_filterinputoutputstream.EX03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CombineFilterStream {
	public static void main(String[] args) throws IOException {
		
		//파일 생성
		File datafile = new File("src/sec04_filterinputoutputstream/files/file2.data");
		
		//데이터 쓰기(DataOutputStream)
		try(OutputStream os = new FileOutputStream(datafile);
			BufferedOutputStream bos = new BufferedOutputStream(os);	
			DataOutputStream dos = new DataOutputStream(bos);) {
			
			dos.writeInt(35);		// 4byte
			dos.writeDouble(5.8);	// 8byte
			dos.writeChar('A');		// 2byte
			dos.writeUTF("안녕하세요");	//15byte
			dos.flush();
		}

		//데이터 읽기(DataInputStream)
		try(InputStream is = new FileInputStream(datafile);
			BufferedInputStream bis = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(bis);) {
				
				System.out.println(dis.readInt());		// 4byte
				System.out.println(dis.readDouble());	// 8byte
				System.out.println(dis.readChar());		// 2byte
				System.out.println(dis.readUTF());		//15byte
			}

	}
}
