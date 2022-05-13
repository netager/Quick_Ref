
public class Program {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result = 0;
		try {
			result = Calculator.add(3,4);
			System.out.printf("add : %d\n", result);
			result = Calculator.sub(3,4);
		}
		catch(천을_넘은_예외 e) {
			System.out.println("[천을_넘은_예외] 지금 1000을 넘는 값을 입력하셨습니다.");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("[Exception e] 입력 값에 오류가 있습니다.");
		}
		finally {
			System.out.println("[finally] 입력 값에 오류가 있습니다.");
		}
		
		System.out.printf("sub : %d\n", result);
		result = Calculator.multi(3,4);
		System.out.printf("multi : %d\n", result);
		result = Calculator.div(3,3);
		System.out.printf("div : %d\n", result);

	}

}
