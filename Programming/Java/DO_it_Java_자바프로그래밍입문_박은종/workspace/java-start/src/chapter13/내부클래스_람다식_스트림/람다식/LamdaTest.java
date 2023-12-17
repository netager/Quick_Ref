package chapter13.����Ŭ����_���ٽ�_��Ʈ��.���ٽ�;


// 1st : ���� ����ϱ� ���� interface ����
// -------------------------------
@FunctionalInterface
interface PrintString {
	void showString(String str);
}

public class LamdaTest {

	public static void main(String[] args) {

		// 2st : ���ٽ� ����� ���� interface implements ����
		// ------------------------------------------
		PrintString lambdaPrint = str->System.out.println(str);
		
		
		
		// 3st : ����� 3����
		// ----------------
		// ��� ���1 : ������ �����ؼ� �ٷ� Implements �ϴ� ���
		lambdaPrint.showString("abc");
		

		
		// �����2 �޼��� call
		showMyString(lambdaPrint);
		
		
		// �����3 �޼��� call
		PrintString reStr = returnPrint();
		reStr.showString("hello ");

	}

	// ��� ���2 �޼��� : Implement�� ��ü�� �Ű������� �Ѿ�� ���
	public static void showMyString(PrintString lambda) {
		lambda.showString("Test Lambda");
	}

	// ��� ���3 �޼��� : Implements �� ��ü�� ��ȯ������ �ѱ�� ���  
	public static PrintString returnPrint() {
		return s->System.out.println(s+"world");
	}

}