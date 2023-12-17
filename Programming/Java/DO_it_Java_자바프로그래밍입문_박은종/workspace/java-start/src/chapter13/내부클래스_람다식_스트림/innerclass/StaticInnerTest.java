package chapter13.����Ŭ����_���ٽ�_��Ʈ��.innerclass;

class OutClass1 {
	
	private int num = 10;
	private static int sNum = 20;
	private InStaticClass inStaticClass;
	
	public OutClass1() {
		inStaticClass = new InStaticClass();
	}
	
	
	static class InStaticClass {
	
		int iNum = 100;
		static int sInNum = 200;
		
		void inStaticTest() {
//			num += 10;		// ���Ұ�
			sNum += 10;		// ��밡��
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
			
		}
		
		static void sTest() {
			sNum += 10;		// ��밡��
			System.out.println(sNum);
//			System.out.println(iNum);		// ���Ұ�
			System.out.println(sInNum);
			
		}
	}
		

	public void usingInStaticTest() {
		inStaticClass.inStaticTest();
		
	}

}


public class StaticInnerTest {
	public static void main(String[] args) {
		
//		OutClass1 outClass1 = new OutClass1();
//		outClass1.usingInStaticTest();
		
		// OutClass1 �������� ��� ����
		// ----------------------
		OutClass1.InStaticClass sInClass1 = new OutClass1.InStaticClass();
		sInClass1.inStaticTest();
		
		OutClass1.InStaticClass.sTest();

	}

}
