package chapter15.�ڹ������.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		
		int i = 0;
		
		System.out.println("���ĺ� �ϳ��� ���� ���͸� ��������");
		i = 0;
		try {
			i = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println((char)i);
		System.out.println("-------------------------------");
		
		try {
			i = System.in.read();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			i = System.in.read();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		System.out.println("���ĺ� �������� ���� ���͸� ��������");
		i = 0;
		try {
			while((i = System.in.read()) != '\n')
				System.out.print((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("End");
		
		int b = 13;
		System.out.println((char)b);



	}

}
