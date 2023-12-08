package ex07_05.thread;

import java.util.ArrayList;

public class Program extends Thread {
	
	int seq;
	
	public Program(int seq) {

		this.seq = seq;
	}

	public void run() {
		System.out.println(this.seq + " thread start. ");
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
		System.out.println(this.seq + " thread end. ");
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Thread> threads = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			Thread t = new Program(i);
			t.start();
			threads.add(t);
		}

//		for(int i=0; i<threads.size(); i++) {
//			Thread t = threads.get(i);
//			
//			try {
//				t.join();
//			} catch(Exception e) {
//				
//			}
//		}
		
		for(Thread t: threads)
		
		try {
			t.join();
		} catch(Exception e) {
			
		}
			
		
		System.out.println("main end");
	}

}
