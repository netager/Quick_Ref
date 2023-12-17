package chapter13.내부클래스_람다식_스트림.innerclass;

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
//				outNum += 10;		// 사용 가능
//
//				System.out.println(outNum);
//				System.out.println(sNum);
//				System.out.println(localNum);
//			}
//			
//		}
//		return new MyRunnable();
//	}
	
	
	// 위 local inner class를 annonymous inner class 로 변경
	// -------------------------------------------------
	public Runnable getRunnable(int i) {
		
		int localNum = 100;	
		return new Runnable() {

			@Override
			public void run() {
				outNum += 10;		// 사용 가능

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
