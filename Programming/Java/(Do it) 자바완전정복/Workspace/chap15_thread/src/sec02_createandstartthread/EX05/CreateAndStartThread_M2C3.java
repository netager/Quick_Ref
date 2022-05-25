package sec02_createandstartthread.EX05;

public class CreateAndStartThread_M2C3 {
	 public static void main(String[] args) {
		 
		 //자막 번호
		 Thread thread1 = new Thread(new Runnable() {
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
		 });

		 
		 //비디오 번호
		 Thread thread2 = new Thread(new Runnable() {
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

		 });

		 // Thread 실행
		 thread1.start();
		 thread2.start();

	}

}
