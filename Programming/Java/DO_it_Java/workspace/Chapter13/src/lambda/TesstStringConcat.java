package lambda;

public class TesstStringConcat {

	public static void main(String[] args) {

		// ��ü���� ���α׷���
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("Hello", "java");
		
		// ���ٽ�
		StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
		concat.makeString("hello", "java");
		
		// �͸� ���� Ŭ����
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(si + " " + s2);
			}
		};
	}

}
