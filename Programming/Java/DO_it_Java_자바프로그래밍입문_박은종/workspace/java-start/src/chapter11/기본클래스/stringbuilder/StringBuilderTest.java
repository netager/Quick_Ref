package chapter11.기본클래스.stringbuilder;

// StringBuilder, StringBuffer 사용하기
//   - 가변적인 배열을 가지고 있어 Garbage가 발생하지 않음
//   - StringBuffer 는 멀티쓰레드 프로그래밍에서 동기화를 보장
//   - StringBuilder는 단일쓰레드 환경에서 사용

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String str1 = new String("java");
		System.out.println(System.identityHashCode(str1));

		StringBuilder buffer = new StringBuilder(str1);
		System.out.println(System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		System.out.println(System.identityHashCode(buffer));
		
		String str2 = buffer.toString();
		System.out.println(System.identityHashCode(str2));
				
	}

}
