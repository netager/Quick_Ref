package lambda;

public class TesstStringConcat {

	public static void main(String[] args) {

		// 객체지향 프로그래밍
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("Hello", "java");
		
		// 람다식
		StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
		concat.makeString("hello", "java");
		
		// 익명 내부 클래스
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(si + " " + s2);
			}
		};
	}

}
