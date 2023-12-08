package chapter02.변수와자료형;

public class BinaryTest2 {

	public static void main(String[] args) {

		// 1의 보수 : 원래 이진수를 반대로(0->1, 1->0으로 변환)
		// 2의 보수 : 변환한 값에 1을 더한다.
		int num1 = 0B00000000000000000000000000000101;
		int num2 = 0B11111111111111111111111111111011; // 2의 보수
		
		
		int sum = num1 + num2;
		System.out.println(num1+","+num2+","+sum);
		

	}

}
