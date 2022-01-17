package interfaceex;

public interface Calc {
	
	// 상수 선언 
	double PI = 3.14;
	int ERROR = -99999999;
	
	// 컴파일시 abstract 추가 됨.
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);

}
