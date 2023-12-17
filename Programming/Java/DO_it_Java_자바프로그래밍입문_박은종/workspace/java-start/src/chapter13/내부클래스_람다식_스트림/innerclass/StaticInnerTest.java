package chapter13.내부클래스_람다식_스트림.innerclass;

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
//			num += 10;		// 사용불가
			sNum += 10;		// 사용가능
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
			
		}
		
		static void sTest() {
			sNum += 10;		// 사용가능
			System.out.println(sNum);
//			System.out.println(iNum);		// 사용불가
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
		
		// OutClass1 생성없이 사용 가능
		// ----------------------
		OutClass1.InStaticClass sInClass1 = new OutClass1.InStaticClass();
		sInClass1.inStaticTest();
		
		OutClass1.InStaticClass.sTest();

	}

}
