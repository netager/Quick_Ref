package binary;

public class BinaryTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0B00000000000000000000000000000101; // ¾ç¼ö 5
		int num2 = 0B11111111111111111111111111111011; // -5
		
		int sum = num1 + num2;
		System.out.println(num1);
		System.out.println(num2);		
		System.out.println(sum);
	}

}
