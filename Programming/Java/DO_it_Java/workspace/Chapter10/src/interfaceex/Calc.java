package interfaceex;

public interface Calc {
	
	double PI = 3.14;     // Compile �� public static final double PI = 3.14 �� ���� 
	int ERROR = -999999999;
	
	int add(int num1, int num2);  // compile �ܰ迡�� public abstract int add(int num1, int num2);
	                              // �����
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
