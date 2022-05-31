package sec01_fileandcharset.EX02;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class FileMethods {
	public static void main(String[] args) {
		
		//#0. C: 드라이브 내에 temp 폴더 생성(없는 경우에)
		File tempDir = new File("c:/temp");
		if(!tempDir.exists())
			tempDir.mkdir();

		//#1. 파일객체 생성
		File file = new File("C:/Windows");
		
		//#2. 파일메서드
		System.out.println("절대경로:" + file.getAbsolutePath());
		System.out.println("폴더(?):" + file.isDirectory());
		System.out.println("파일(?):" + file.isFile());
		System.out.println("이름:" + file.getName());
		System.out.println("부모폴더(?):" + file.getParent());
		
		File newfile1 = new File("C:/temp/abc");
		if(!newfile1.exists())
			System.out.println(newfile1.mkdir());
		
		File newfile3 = new File("C:/temp/bcd/cde");
		if(!newfile3.exists())
			System.out.println(newfile3.mkdirs());
		
		File[] fnames = file.listFiles();
		for (File fname : fnames) {
			System.out.println((fname.isDirectory()?"폴더: ":"파일: ") + fname.getName());
		}
		
	}

}
