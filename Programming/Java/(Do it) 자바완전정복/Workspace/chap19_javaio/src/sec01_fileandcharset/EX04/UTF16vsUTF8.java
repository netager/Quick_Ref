package sec01_fileandcharset.EX04;

import java.io.UnsupportedEncodingException;

public class UTF16vsUTF8 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		//#UTF16 vs. UTF-8
		byte[] b1 = "abc".getBytes("UTF-16");	//문자열 --> byte[]
		byte[] b2 = "abc".getBytes("UTF-8");	//문자열 --> byte[]
		
		System.out.println(b1.length);	//8 - BOF 코드 2byte가 들어감(FE FF), 한글/영어 모두 2byte
		System.out.println(b2.length);	//3 - 영문 1byte, 한글 3byte
		
		for (byte b : b1)
			System.out.printf("%02X ", b);
		System.out.println();

		for (byte b : b2)
			System.out.printf("%02X ", b);
		System.out.println();

		System.out.println(new String(b1, "UTF-16"));
		System.out.println(new String(b2, "UTF-8"));
		System.out.println(new String(b1, "UTF-8")); 	
		System.out.println(new String(b2, "UTF-16"));	
		System.out.println();

		byte[] b3 = "가나다".getBytes("UTF-16");	//문자열 --> byte[]
		byte[] b4 = "가나다".getBytes("UTF-8");	//문자열 --> byte[]
		
		System.out.println(b3.length);	//8 - BOF 코드 2byte가 들어감(FE FF), 한글/영어 모두 2byte
		System.out.println(b4.length);	//9 - 영문 1byte, 한글 3byte
		
		for (byte b : b3)
			System.out.printf("%02X ", b);
		System.out.println();

		for (byte b : b4)
			System.out.printf("%02X ", b);
		System.out.println();

		System.out.println(new String(b3, "UTF-16"));
		System.out.println(new String(b4, "UTF-8"));
		System.out.println(new String(b3, "UTF-8")); 	
		System.out.println(new String(b4, "UTF-16"));	
		System.out.println();

	}
}
