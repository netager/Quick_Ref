package sec04_synchronizedmethodandblock.EX05;

class MyData {
	// this 동기화키 사용
	synchronized void abc() {
		for (int i=0; i<2; i++) {
			System.out.println(i + "sec");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	// this 동기화키 사용
	synchronized void bcd() {
		for (int i=0; i<2; i++) {
			System.out.println(i + "초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void cde() {
		// this 동기화키 사용
		synchronized(new Object()) {
			for (int i=0; i<2; i++) {
				System.out.println(i + "번째");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}


public class KeyObject_2 {
	public static void main(String[] args) {
		//# 공유객체
		MyData myData = new MyData();
		
		//# 세개의 쓰레드가 각각의 메서드 호출
		new Thread() {
			public void run() {
				myData.abc();
			};
		}.start();
				
		new Thread() {
			public void run() {
				myData.bcd();
			};
		}.start();

		new Thread() {
			public void run() {
				myData.cde();
			};
		}.start();

	}

}
