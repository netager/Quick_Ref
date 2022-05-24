package sec02_exceptionhandlingsyntax.EX04;

public class MultiCatch_3 {
	public static void main(String[] args) {
		
		//#1. catch 블록을 각각 처리한 경우
		try {
			System.out.println(3 / 0); 			// 실행예외(ArithmeticException)
			int num = Integer.parseInt("10A"); 	// 실행예외(NumberFormatException)
		} 
		catch (NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 없습니다.");
		} 
		catch (Exception e) {
			System.out.println("숫자는 0으로 나눌수 없습니다.");
		}
		System.out.println("------------------------");
		//#2. catch 블록을 하나로 통일한 경우
		try {
			System.out.println(3 / 1); 			// 실행예외(ArithmeticException)
			int num = Integer.parseInt("10A"); 	// 실행예외(NumberFormatException)
		} 
		catch (ArithmeticException | NumberFormatException e) {
			System.out.println("예외가 발생했습니다.");
		} 

	}

}
