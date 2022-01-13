package assignment;

public class OperationEx5 {
	public static void main(String[] args) {
		int num1 = 5;  // 0000 0101
		int num2 = 11; // 0000 1011
		
		int result = num1 & num2;  // 0000 0001
		System.out.println(result);
		System.out.println("-------------------------");
		result = num1 | num2;   	// 0000 1111
		System.out.println(result);
		
		// 00000101
		int num3 = 5;  // 0000 0101
		System.out.println("-------------------------");
		System.out.println(num3 << 1); // 0000 1010 = 10 = 5 * 2^1, 쉬프트 했다고 해서 num3의 값이 변경되지는 않음
		System.out.println(num3 << 2); // 0001 0100 = 20 = 5 * 2^2
 		System.out.println(num3 << 3); // 0010 1000 = 40 = 5 * 2^3
		
 		System.out.println("-------------------------");
		System.out.println(num3>>1);   // 0000 0010 = 2 = 5 / 2
		System.out.println(num3>>2);   // 0000 0010 = 1 = 5 / 2^2
		
		System.out.println("-------------------------");
		System.out.println(num3 <<= 1);
		System.out.println(num3);
		
	}
}
