package sec05_threadstates.EX03;

class MyThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(" -- sleep() 진행중 interrupt() 실행");
			for(long i=0; i<1000000000L; i++) {}
		}
	}
	
}


public class TimedWaiting_Sleep {
	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		myThread.start();	// 1단계(Thread를 실행시키기 위한 준비) + 2단계(Thread의 run() 호출)
							// 1단계는 Runnable 상태, 2단계 진행중 sleep() 로 들어가면 Timed Waiting 상태
		try {Thread.sleep(100);} catch (InterruptedException e) {} 	// 2단계 sleep() 상태를 확인하기 위해 지연시간 발생 시킴
		
		System.out.println("MyThread State " + myThread.getState());
		
		myThread.interrupt();	// 수동으로 interrupt() 발생 - catch 블록 실행
		try {Thread.sleep(100);} catch (InterruptedException e) {}
		System.out.println("MyThread State " + myThread.getState()); //Runnable 상태
	}

}
