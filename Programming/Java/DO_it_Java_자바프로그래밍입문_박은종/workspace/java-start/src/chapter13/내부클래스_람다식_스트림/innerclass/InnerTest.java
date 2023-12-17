package chapter13.����Ŭ����_���ٽ�_��Ʈ��.innerclass;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	
	private class InClass {		// Instance inner class
		                // member ����ó�� ����� class
		int inNum = 200;
//		static int sInNum = 100;  // Inner Class������ static ��� �Ұ�
		
		void inTest() {
			System.out.println(num); // private ���� ��� ����
			System.out.println(sNum);
		}

		
//		static void sTest() {  // static Method ��� �Ұ�
//			
//		}
	}
		
	public void usingInTest() {
		inClass.inTest();
		
	}
	
}


public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
//		outClass.inClass.inTest();
//		
//		OutClass.InClass inClass = outClass.new InClass();
//		inClass.inTest();
		
		outClass.usingInTest();

	}

}
