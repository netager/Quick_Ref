package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		
		// 타입 상속
		Calc calc = new CompleteCalc();
		// Calc calc1 = new Calc();          // 인터페이스는 new 될수 없음
		// Calc calc2 = new Calcualtor();       // 추상 클래스이므로 new 될 수 없음

		Calculator cal3 = new CompleteCalc();
			
		System.out.println(calc.add(num1, num2));
	}

}
