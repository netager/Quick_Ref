package chapter10.�������̽�.interfaceetc;

public interface Calc {
	
	double PI = 3.14;		// pre-compile�� public static final�� ���ǵ�
	int ERROR = -9999999;
	
	int add(int num1, int num2); // pre-compile�� public abstract�� ���ǵ�
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i: arr) {
			total += i;
		}
		
		return total;
		
	}

// java9���� ������
//	private void myMethod() {
//		System.out.println("private method �Դϴ�.");
//	}
	

}
