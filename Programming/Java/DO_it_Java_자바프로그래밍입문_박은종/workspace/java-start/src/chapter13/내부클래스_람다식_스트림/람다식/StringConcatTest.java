package chapter13.����Ŭ����_���ٽ�_��Ʈ��.���ٽ�;

public class StringConcatTest {

	public static void main(String[] args) {

		// implements �����ϰ� ��ü�� �����Ͽ� ����
		StringConcatImpl stringConcat = new StringConcatImpl();
		
		stringConcat.makeString("Hello", "World");
		
		
		// lambda ���� �̿��� ����
		StringConcat concat = (s1,s2)->System.out.println(s1 + " " + s2);
		concat.makeString("Hello", "World");
		
		// �͸� ���� Ŭ������ ����
		StringConcat concat2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);
				
			}
			
		};
		
		concat2.makeString("hello", "java");
			
	}
}
