package chapter10.인터페이스.interfaceetc;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		if(calc instanceof CompleteCalc) {
			CompleteCalc completeCalc = (CompleteCalc)calc;
			completeCalc.showInfo();
		}
		
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		
		int sum = Calc.total(arr);
		System.out.println(sum);

	}

}
