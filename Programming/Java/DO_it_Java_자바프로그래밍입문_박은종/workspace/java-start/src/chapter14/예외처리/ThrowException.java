package chapter14.예외처리;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	public static void main(String[] args) {
		
		ThrowException ex = new ThrowException();
		try {
			ex.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
//			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
//			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("End");
	}

}
