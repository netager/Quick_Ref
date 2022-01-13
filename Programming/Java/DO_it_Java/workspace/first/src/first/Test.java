package first;

public class Test {

	public static void main(String[] args) {

		int num = 127;
		int bNum = 0B1010;
		int oNum = 012;
		int hNum = 0xA;
		
		String binaryString = Integer.toBinaryString(num);
		String octalString = Integer.toOctalString(num);
		String hexString = Integer.toHexString(num);
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
		
		System.out.println(binaryString);
		System.out.println(octalString);
		System.out.println(hexString);

		
	}

}
