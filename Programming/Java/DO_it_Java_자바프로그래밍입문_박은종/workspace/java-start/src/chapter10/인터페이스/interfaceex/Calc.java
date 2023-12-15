package chapter10.인터페이스.interfaceex;

public interface Calc {
	
	double PI = 3.14;		// pre-compile시 public static final로 정의됨
	int ERROR = -9999999;
	
	int add(int num1, int num2); // pre-compile시 public abstract로 정의됨
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);

}
