package sec02_string.EX06;

import java.util.Arrays;

public class MethodOfString_2 {

	public static void main(String[] args) {
		
		//#5. 문자열 수정
		//@ toLowerCase(), toUpperCase()
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase()); 
		System.out.println(str1.toUpperCase());
		
		//@ replace(,)
		System.out.println(str1.replace("Study", "공부"));
		
		//@ substring()
 		System.out.println(str1.substring(0,5)); // 0<=  <5
		
 		//@ split()
 		String[] strArray = "abc/def-ghi jkl".split("/|-| ");
 		System.out.println(Arrays.toString(strArray));
 		
 		//@ trim() - 앞뒤에 공백
 		System.out.println("   abc   ".trim());
 		System.out.println("------------------------------------");
 		
		
 		//#6. 문자열의 내용 비교 (equals(), equalsIgnoreCase())
 		String str2 = new String("Java");
 		String str3 = new String("Java");
 		String str4 = new String("java");
 		
 		//@ stack 메모리 비교 
 		System.out.println(str2 == str3);
 		System.out.println(str3 == str4);
 		System.out.println(str4 == str2);
 		System.out.println("------------------------------------");
 		
 		//@ equals(), equalsIgnoreCase() : 내용 비교
 		System.out.println(str2.equals(str3)); 				// true 번지를 비교하는 것이 아니라 내용을 비교
 		System.out.println(str3.equals(str4)); 				// false
 		System.out.println(str3.equalsIgnoreCase(str4)); 	// true - 대소문자 상관럾이 비교
 		System.out.println("------------------------------------");
 		


	}

}
