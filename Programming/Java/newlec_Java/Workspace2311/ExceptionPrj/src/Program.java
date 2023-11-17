
public class Program {

	public static void main(String[] args) {
//		Calculator calc = new Calculator();
		
		int result = 0;

		result = Calculator.add(3, 4);
		System.out.printf("add : %d\n", result);
		
		result = Calculator.sub(78,4);
		System.out.printf("sub : %d\n", result);
			

		result = Calculator.multi(3,4);
		System.out.printf("multi : %d\n", result);
		
		result = Calculator.div(3,1);
		System.out.printf("div : %d\n", result);
		
//		System.out.printf("add : %d", result);

	}

}
