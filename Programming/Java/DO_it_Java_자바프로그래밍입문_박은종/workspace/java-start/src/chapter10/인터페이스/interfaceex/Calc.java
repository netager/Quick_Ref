package chapter10.�������̽�.interfaceex;

public interface Calc {
	
	double PI = 3.14;		// pre-compile�� public static final�� ���ǵ�
	int ERROR = -9999999;
	
	int add(int num1, int num2); // pre-compile�� public abstract�� ���ǵ�
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);

}
