package chapter10.인터페이스.interfaceetc;

public interface Calc {
	
	double PI = 3.14;		// pre-compile시 public static final로 정의됨
	int ERROR = -9999999;
	
	int add(int num1, int num2); // pre-compile시 public abstract로 정의됨
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i: arr) {
			total += i;
		}
		
		return total;
		
	}

// java9부터 가능함
//	private void myMethod() {
//		System.out.println("private method 입니다.");
//	}
	

}
