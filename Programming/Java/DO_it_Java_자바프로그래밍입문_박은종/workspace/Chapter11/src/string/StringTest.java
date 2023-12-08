package string;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // 같은 주소인지 확인 - false
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4); // 같은 주소인지 확인 - true
		
		
		String str5 = new String("java");
		String str6 = new String("android");
		
		System.out.println(System.identityHashCode(str5));
		
		str5 = str5.concat(str6); // 새로 생성된 문자열을 가리키게 됨.
		
		System.out.println(System.identityHashCode(str5));
		
		System.out.println(str5);
		
		System.out.println(str5 + str6);
		
		
				
	}

}
