package sec01_fileandcharset.EX01;

import java.io.File;
import java.io.IOException;

public class CreateFileObject {
	public static void main(String[] args) throws IOException {
		
		//#1. C: 드라이브 내에 temp 폴더 생성(없는 경우에)
		File tempDir = new File("c:/temp");
		if(!tempDir.exists())
			tempDir.mkdir();
		
		System.out.println(tempDir.exists());	//true
		
		//#1-2. 파일 객체 생성(실제파일 생성)
		File newFile = new File("c:/temp/newFile.txt");
		if(!newFile.exists())
			newFile.createNewFile();
		
		System.out.println(newFile.exists());	//true
		
		//#2. 파일 구분자
		File newFile2 = new File("C:\\temp\\newFile.txt");
		File newFile3 = new File("C:/temp/newFile.txt");
		File newFile4 = new File("C:"+File.separator+"temp"+File.separator+"newFile.txt");
		
		System.out.println(newFile2.exists()); 	//true
		System.out.println(newFile3.exists()); 	//true
		System.out.println(newFile4.exists()); 	//true
		
		//#3-1. 절대경로
		File newFile5 = new File("C:/abc/newFile.txt");
		File newFile6 = new File("C:/abc/bcd/newFile.txt");
		System.out.println(newFile5.getAbsolutePath());
		System.out.println(newFile6.getAbsolutePath());
		
		//#3-2. 상대경로
		//현재위치
		System.out.println(System.getProperty("user.dir"));	//현재 작업폴더 위치
		File newFile7 = new File("newFile1.txt");
		File newFile8 = new File("bcd/newFile1.txt");
		
		System.out.println(newFile7.getAbsolutePath());
		System.out.println(newFile8.getAbsolutePath());
		
		
		
	}
}
