package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		
		
		// 
		// Calc         - Interface
		// Calculator   - abstract Class
		// CompleteCalc - Class
		//
		
		// 타입 상속
		Calc calc = new CompleteCalc();
		
		// 인터페이스는 new 될수 없음
		// Calc calc1 = new Calc();
		
		// 추상 클래스이므로 new 될 수 없음
		// Calc calc2 = new Calcualtor();       

		Calculator calc3 = new CompleteCalc();
		
		CompleteCalc calc4 = new CompleteCalc();
			
		System.out.println(calc.add(num1, num2));
		calc.description();
		
		System.out.println(calc3.add(num1, num2));
		calc3.description();

		System.out.println(calc4.add(num1, num2));
		calc4.description();

		
		//  Calc Interface 에 Static Method인 total()
		// 사용시 Calc.total()을 직접 사용
		// static 메소드 이므로 프로그램 로딩시 메모리에 적재 됨.
		// ------------------------------------------
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println("Sum : " + sum);

	}

}
