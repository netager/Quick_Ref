package chapter13.내부클래스_람다식_스트림.람다식;

public class TestMyNumber {

	public static void main(String[] args) {

		MyNumber maxNumber = (x, y) -> (x>=y)?x:y; // 구현부
		
		int max = maxNumber.getMaxNumber(10, 20);  // 사용부
		System.out.println(max);

		int i = 100;
		MyNumber aaa = new MyNumber() {

			@Override
			public int getMaxNumber(int num1, int num2) {
				System.out.println(i);
				return 0;
			}
		};
	}

}
