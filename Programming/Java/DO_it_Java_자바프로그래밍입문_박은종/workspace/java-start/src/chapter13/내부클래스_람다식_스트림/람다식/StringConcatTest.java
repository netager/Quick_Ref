package chapter13.내부클래스_람다식_스트림.람다식;

public class StringConcatTest {

	public static void main(String[] args) {

		// implements 구현하고 객체를 생성하여 구현
		StringConcatImpl stringConcat = new StringConcatImpl();
		
		stringConcat.makeString("Hello", "World");
		
		
		// lambda 식을 이용한 구현
		StringConcat concat = (s1,s2)->System.out.println(s1 + " " + s2);
		concat.makeString("Hello", "World");
		
		// 익명 내부 클래스로 구현
		StringConcat concat2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);
				
			}
			
		};
		
		concat2.makeString("hello", "java");
			
	}
}
