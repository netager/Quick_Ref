package sec05_threadstates.EX01;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class NewRunnableTerminated {
	public static void main(String[] args) {
		
		//# 쓰레드 상태 저장 클래스 
		Thread.State state;
		
		//#1. 객체 생성(NEW)
		Thread thread = new Thread() {
			@Override
			public void run() {
				for(long i=0; i<1000000000L; i++) {}
			}
		};
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp); // 생성한 timestamp 출력
        
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        state = thread.getState();
		System.out.println("thread state = " + state);
		System.out.println("----------------------------------------");
		
		//#2. Thread 시작
		thread.start();
		state = thread.getState();
		System.out.println("thread state = " + state);
		System.out.println("----------------------------------------");

        LocalDateTime now1 = LocalDateTime.now();

		//#3. Thread 종료
		try {thread.join();} catch (InterruptedException e) {}

        System.out.println("thread start Time : " + now1);
		LocalDateTime now2 = LocalDateTime.now();
        System.out.println("thread End Time : " + now2);
		
		state = thread.getState();
		System.out.println("thread state = " + state);
		System.out.println("----------------------------------------");
		
	}

}
