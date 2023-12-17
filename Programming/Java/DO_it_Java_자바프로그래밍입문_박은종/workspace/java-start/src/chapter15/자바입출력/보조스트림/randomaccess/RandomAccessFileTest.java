package chapter15.자바입출력.보조스트림.randomaccess;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) {

		try {
			RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
			rf.writeInt(100); // 4bytes
			System.out.println(rf.getFilePointer());
			rf.writeDouble(3.14); // 8bytes
			System.out.println(rf.getFilePointer());
			rf.writeUTF("안녕하세요"); // 17bytes : 한글 1개당 3byte(3*5) + null character(2bytes)
			System.out.println(rf.getFilePointer());
			System.out.println("--------------------------------");
			
			// File Point 이동
			rf.seek(0);
			
			int i = rf.readInt();
			double d = rf.readDouble();
			String str = rf.readUTF();
			
			System.out.println(i);
			System.out.println(d);
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		

	}

}
