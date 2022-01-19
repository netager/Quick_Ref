package string;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println("-----------");
		
		String str5 = new String("java");
		String str6 = new String("android");
		
		
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6));
		
		// java��android ���ڰ� ����� ���ڿ��� ���� �޸𸮿� �Ҵ��ϰ� str5���� �ּ� ����  
		str5 = str5.concat(str6);
		System.out.println("�ΰ��� ���ڿ� ���� �� ��� : " + str5);
		
		System.out.println(System.identityHashCode(str5));
		

		System.out.println("------------------------------");		
		System.out.println("str1: " + str1 + "," + "str2: " + str2 + "," + (str1 == str2));
		System.out.println("str1: " + str1 + "," + "str2: " + str2 + "," + (str1 == str2));
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str1.hashCode() == str2.hashCode());
		
		String str3 = "abc";
		String str4 = "abc";

		
		System.out.println("------------------------------");
		System.out.println(str1 == str2);  // ������ �ּ��� ���ϼ�?
		System.out.println(str1.equals(str2));  // ���� ���� ���ϼ�?
		System.out.println(str1.hashCode());    // 
		System.out.println(str2.hashCode());

		System.out.println("------------------------------");
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());

		
	}

}
