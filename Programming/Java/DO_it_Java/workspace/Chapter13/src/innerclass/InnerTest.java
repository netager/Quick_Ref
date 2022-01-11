package innerclass;

class OutClass {
	
	private int num = 10;
	private static int sNum = 10;
	private InClass inClass;
		
	public OutClass() {
		inClass = new InClass();
	}
	
	// Instance Inner Class
	private class InClass {
		int inNum = 200;
		// static int sInNum = 100;   // Inner Class 에서는 static 변수를 선언할 수 없음.
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum); // 전역변수를 가져다 쓰는 것은 문제 없음 
		}
	}

	
	public void usingInTest() {
		inClass.inTest();
	}
	
	static class InStaticClass() {
		int iNum = 100;
		static int sInNUM = 200;
		
		void inTest() {
			// num += 10;
			sNum += 10;
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		static void sTest() {
			System.out.println(sNum);
			System.out.println(sInNum);			
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		outClass.usingInTest();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
	}

}
