package chapter13.����Ŭ����_���ٽ�_��Ʈ��.innerclass;

class Outer {
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable runnable = new Runnable() {

		@Override
		public void run() {
			System.out.println("runnable");
			
		}
	};
	
	// local inner class
	// -----------------
//	public Runnable getRunnable() {
//	
//		int localNum = 100;	
//		class MyRunnable implements Runnable {
//
//			@Override
//			public void run() {
//				outNum += 10;		// ��� ����
//
//				System.out.println(outNum);
//				System.out.println(sNum);
//				System.out.println(localNum);
//			}
//			
//		}
//		return new MyRunnable();
//	}
	
	
	// �� local inner class�� annonymous inner class �� ����
	// -------------------------------------------------
	public Runnable getRunnable(int i) {
		
		int localNum = 100;	
		return new Runnable() {

			@Override
			public void run() {
				outNum += 10;		// ��� ����

				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				System.out.println(i);
			}
		};
		
	}

}


public class LocalInnerTest {

	public static void main(String[] args) {

		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(20);
		runnable.run();
	}

}
