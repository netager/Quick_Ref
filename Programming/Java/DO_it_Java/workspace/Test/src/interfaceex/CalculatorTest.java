package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		
		// Ÿ�� ���
		Calc calc = new CompleteCalc();
		// Calc calc1 = new Calc();          // �������̽��� new �ɼ� ����
		// Calc calc2 = new Calcualtor();       // �߻� Ŭ�����̹Ƿ� new �� �� ����

		Calculator cal3 = new CompleteCalc();
			
		System.out.println(calc.add(num1, num2));
	}

}
