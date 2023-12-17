package chapter14.����ó��;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourcesTest {

	public static void main(String[] args) {

		// try with resources ����
		// ----------------------
		try (FileInputStream fis = new FileInputStream("a.txt")){
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("End");
	}

}
