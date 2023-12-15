package interfaceex;

public class CalculatorTest {
	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 2;
	
		Calc calc = new CompleteCalc();  // Clinet Code - 인터페이스를 기반으로 구현한 것.
		System.out.println(calc.add(num1, num2));
		
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);

	}
	
}
