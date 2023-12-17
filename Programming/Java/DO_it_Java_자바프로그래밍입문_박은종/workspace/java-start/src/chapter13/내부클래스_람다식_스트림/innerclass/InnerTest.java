package chapter13.내부클래스_람다식_스트림.innerclass;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	
	private class InClass {		// Instance inner class
		                // member 변수처럼 선언된 class
		int inNum = 200;
//		static int sInNum = 100;  // Inner Class에서는 static 상요 불가
		
		void inTest() {
			System.out.println(num); // private 변수 사용 가능
			System.out.println(sNum);
		}

		
//		static void sTest() {  // static Method 사용 불가
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
