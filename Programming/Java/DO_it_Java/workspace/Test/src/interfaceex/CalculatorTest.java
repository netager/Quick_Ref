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
		
		// Ÿ�� ���
		Calc calc = new CompleteCalc();
		
		// �������̽��� new �ɼ� ����
		// Calc calc1 = new Calc();
		
		// �߻� Ŭ�����̹Ƿ� new �� �� ����
		// Calc calc2 = new Calcualtor();       

		Calculator calc3 = new CompleteCalc();
		
		CompleteCalc calc4 = new CompleteCalc();
			
		System.out.println(calc.add(num1, num2));
		calc.description();
		
		System.out.println(calc3.add(num1, num2));
		calc3.description();

		System.out.println(calc4.add(num1, num2));
		calc4.description();

		
		//  Calc Interface �� Static Method�� total()
		// ���� Calc.total()�� ���� ���
		// static �޼ҵ� �̹Ƿ� ���α׷� �ε��� �޸𸮿� ���� ��.
		// ------------------------------------------
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println("Sum : " + sum);

	}

}
