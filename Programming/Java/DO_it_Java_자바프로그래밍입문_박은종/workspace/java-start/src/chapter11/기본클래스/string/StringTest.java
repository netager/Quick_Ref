package chapter11.�⺻Ŭ����.string;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);

		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);


		// String Ŭ������ ���ڿ� ����
		//   - �ѹ� ������ ���ڿ��� ������ �ʴ´� : immutable
		String str5 = new String("java");
		String str6 = new String("android");
		System.out.println(System.identityHashCode(str5));
		
		str5 = str5.concat(str6);
		System.out.println(str5);
		System.out.println(System.identityHashCode(str5));
		
		
		
	}

}
