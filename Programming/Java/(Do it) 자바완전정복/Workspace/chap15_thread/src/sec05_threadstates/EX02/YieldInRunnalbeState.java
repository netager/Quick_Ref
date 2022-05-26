package sec05_threadstates.EX02;

import java.time.LocalDateTime;

class MyThread extends Thread {
	boolean yieldFlag;
	@Override
	public void run() {
		while (true) {
			if(yieldFlag) {
				Thread.yield();
			} else {
				System.out.println(getName() + " 실행");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
				
				for(long i=0; i<1000000000; i++) {} //시간 지연
			}
		}
	}
}

public class YieldInRunnalbeState {
	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread();
		thread1.setName("thread1");
		thread1.yieldFlag=false;
		thread1.setDaemon(true); // main method가 종료되면 thread 도 종료
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.setName("thread2");
		thread2.yieldFlag=true;
		thread2.setDaemon(true); // main method가 종료되면 thread 도 종료
		thread2.start();

	
		//#1. 6초 지연, main() 함수가 종료되면 thread도 종료되기 때문에 main()을 6초정도 수행되게 함.
		
		LocalDateTime now1 = LocalDateTime.now();

		for(int i=0; i< 6; i++) { 
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			thread1.yieldFlag=!thread1.yieldFlag;
			thread2.yieldFlag=!thread2.yieldFlag;
		}
		
		LocalDateTime now2 = LocalDateTime.now();
        System.out.println("For loop Start Time : " + now1);
		System.out.println("For loop End   Time : " + now2);

		
	}

}
