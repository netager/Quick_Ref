package chapter01.�ڹ����α׷��ֽ����ϱ�;

public class HelloWorld {

	public static void main(String[] args) {
		
		int num = 10;
		int bNum = 0b1010;
		int oNum = 012;
		int hNum = 0xA;
		
		String binary = Integer.toBinaryString(num);	// 10���� -> 2����
		String octal = Integer.toOctalString(num); 		// 10���� -> 8���� 
		String hexaDecimal = Integer.toHexString(num); 	// 10���� -> 16���� 
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);

		System.out.println(binary);
		System.out.println(octal);
		System.out.println(hexaDecimal);

	}

}
