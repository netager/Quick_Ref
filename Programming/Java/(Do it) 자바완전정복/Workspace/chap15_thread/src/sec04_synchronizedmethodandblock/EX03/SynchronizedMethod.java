package sec04_synchronizedmethodandblock.EX03;

//# 공유 객체
class MyData {
	int data = 3;
	
	public void plusData() {	// 동기화 수행 : synchronized
		synchronized (this) {
			int mydata = data;
			try { Thread.sleep(2000);} catch (InterruptedException e) {}
			data = mydata + 1;
		}
	}
}

//# 공유객체를 사용하는 쓰레드 
class PlusThread extends Thread {
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "실행결과 : " + myData.data);
	}
}


public class SynchronizedMethod {
	public static void main(String[] args) {
		//# 공유객체 생성
		MyData myData = new MyData();
		
		//#1. PlusThread
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}

		//#1. PlusThread
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();

	}

}
