package sec02_createandstartthread.EX04;

//#1. 방법2(M2). Thread 클래스 상속하여 클래스 생성 case2: 3개의 쓰레드 생성
class SMIFileRunnable implements Runnable {
	@Override
	public void run() {
		//#2. 자막 번호 하나 ~ 다섯
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try {
			Thread.sleep(10);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		//#4. 자막번호 출력
		for (int i=0; i<strArray.length; i++) {
			System.out.println(" - (자막번호) " + strArray[i]);
			try { Thread.sleep(200);} catch (InterruptedException e) {}
		}

	}
}

class VideoFileRunnable implements Runnable {
	//#1. 비디오프레임1~5
	@Override
	public void run() {
		int[] intArray = {1,2,3,4,5};
		
		//#3. 비디오 프레임 출력
		for (int i=0; i<intArray.length; i++) {
			System.out.print("(비디오프레임) " + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}

public class CreateAndStartThread_M2C2 {
	 public static void main(String[] args) {
		 
		 //SMIFileThread 객체 생성 및 시작
		 Runnable smiFileRunnable = new SMIFileRunnable();
		 Thread thread1 = new Thread(smiFileRunnable);
		 thread1.start();
		 
		 //VideoFileThread 객체 생성 및 시작
		 Runnable videoFileRunnable = new VideoFileRunnable();
		 Thread thread2 = new Thread(videoFileRunnable);
		 thread2.start();

	}

}
