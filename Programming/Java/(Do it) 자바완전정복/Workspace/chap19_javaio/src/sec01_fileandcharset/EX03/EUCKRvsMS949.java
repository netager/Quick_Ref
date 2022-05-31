package sec01_fileandcharset.EX03;

import java.io.UnsupportedEncodingException;

public class EUCKRvsMS949 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		//#EUC-KR vs. MS949
		byte[] b1 = "a".getBytes("EUC-KR");	//문자열 --> byte[]
		byte[] b2 = "a".getBytes("MS949");	//문자열 --> byte[]
		
		System.out.println(b1.length);	//1
		System.out.println(b2.length);	//1
		
		System.out.println(new String(b1, "EUC-KR"));
		System.out.println(new String(b2, "MS949"));
		System.out.println(new String(b1, "MS949")); 	//영문자 이기때문에 동일
		System.out.println(new String(b2, "EUC-KR"));	//영문자 이기때문에 동일
		System.out.println();
		
		byte[] b3 = "가".getBytes("EUC-KR");	//문자열 --> byte[]
		byte[] b4 = "가".getBytes("MS949");	//문자열 --> byte[]
		
		System.out.println(b3.length);	//2
		System.out.println(b4.length);	//2
		
		System.out.println(new String(b3, "EUC-KR"));
		System.out.println(new String(b4, "MS949"));
		System.out.println(new String(b3, "MS949")); 	//일부 한글 동일
		System.out.println(new String(b4, "EUC-KR"));	//일부 한글 동일
		System.out.println();
		
		byte[] b5 = "밹".getBytes("EUC-KR");	//문자열 --> byte[]
		byte[] b6 = "밹".getBytes("MS949");	//문자열 --> byte[]
		
		System.out.println(b5.length);	//1
		System.out.println(b6.length);	//2
		
		System.out.println(new String(b5, "EUC-KR"));
		System.out.println(new String(b6, "MS949"));
		System.out.println(new String(b5, "MS949")); 	//한글 깨짐
		System.out.println(new String(b6, "EUC-KR"));	//한글 깨짐
		System.out.println();

		
	}

}
