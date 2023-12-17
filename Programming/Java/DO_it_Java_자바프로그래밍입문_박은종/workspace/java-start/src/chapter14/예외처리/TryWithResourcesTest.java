package chapter14.예외처리;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourcesTest {

	public static void main(String[] args) {

		// try with resources 구현
		// ----------------------
		try (FileInputStream fis = new FileInputStream("a.txt")){
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("End");
	}

}
