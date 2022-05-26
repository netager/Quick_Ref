package sec05_threadstates.EX07;

class DataBox {
	boolean isEmpty = true;
	int data;
	
	synchronized void inputData(int data) {
		if(!isEmpty) {
			try {wait();} catch (InterruptedException e) {}
		}
		this.data = data;
		isEmpty=false;
		System.out.println("입력데이터 : " + data);
		notify();
	}
	
	synchronized void outputData() {
		if(isEmpty) {
			try {wait();} catch (InterruptedException e) {}
		}
		System.out.println("출력데이터 : " + data);
		isEmpty = true;
		notify();
	}
}

public class Waiting_WaitNotify_2 {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		Thread t1 = new Thread() {
			public void run() {
				for(int i=0; i<9; i++) {
					dataBox.inputData(i);
					
				}
			};
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i=0; i<9; i++) {
					dataBox.outputData();
				}
			};
		};
		
		t1.start();
		t2.start();
	}
}
