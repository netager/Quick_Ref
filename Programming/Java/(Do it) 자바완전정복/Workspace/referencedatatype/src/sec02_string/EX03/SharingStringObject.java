package sec02_string.EX03;

public class SharingStringObject {

	public static void main(String[] args) {
		
		//#1. 문자열 객체를 공유(리터럴로 객체를 생성한 경우) new 키워드로 객체 생성한 경우(별도의 객체 생성) 공유 X
		String str1 = new String("안녕"); // new로 만든 객체는 공유 기능이 없음
		String str2 = "안녕"; 
		String str3 = "안녕"; // str2 와 str3 은 str2의"안녕"을 저장
		String str4 = new String("안녕");
		
		//@stack 메모리값 비교(==)
		System.out.println(str1==str2); 	// false
		System.out.println(str2==str3);		// true
		System.out.println(str3==str4);		// false
		System.out.println(str4==str1);		// false

	}

}