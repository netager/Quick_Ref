package chapter11.기본클래스.string;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);

		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);


		// String 클래스로 문자열 연결
		//   - 한번 생성된 문자열은 변하지 않는다 : immutable
		String str5 = new String("java");
		String str6 = new String("android");
		System.out.println(System.identityHashCode(str5));
		
		str5 = str5.concat(str6);
		System.out.println(str5);
		System.out.println(System.identityHashCode(str5));
		
		
		
	}

}
