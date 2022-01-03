package interfaceex;

public interface Calc {
	
	double PI = 3.14;     // Compile 시 public static final double PI = 3.14 로 변경 
	int ERROR = -999999999;
	
	int add(int num1, int num2);  // compile 단계에서 public abstract int add(int num1, int num2);
	                              // 변경됨
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
