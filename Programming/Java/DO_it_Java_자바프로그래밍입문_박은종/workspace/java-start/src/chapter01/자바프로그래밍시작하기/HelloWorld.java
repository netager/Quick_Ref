package chapter01.자바프로그래밍시작하기;

public class HelloWorld {

	public static void main(String[] args) {
		
		int num = 10;
		int bNum = 0b1010;
		int oNum = 012;
		int hNum = 0xA;
		
		String binary = Integer.toBinaryString(num);	// 10진수 -> 2진수
		String octal = Integer.toOctalString(num); 		// 10진수 -> 8진수 
		String hexaDecimal = Integer.toHexString(num); 	// 10진수 -> 16진수 
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);

		System.out.println(binary);
		System.out.println(octal);
		System.out.println(hexaDecimal);

	}

}
