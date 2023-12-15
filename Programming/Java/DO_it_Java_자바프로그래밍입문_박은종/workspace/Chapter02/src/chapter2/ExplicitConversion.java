package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {

		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println("-------------------");
		System.out.println(bNum);
		System.out.println(iNum);
		
		double dNum = 3.14;
		iNum = (int)dNum;
		
		System.out.println("-------------------");
		System.out.println(dNum);
		System.out.println(iNum);
		
		float fNum = 0.9f;
		int num1 = (int)dNum + (int)fNum;
		int num2 = (int)(dNum + fNum);
		
		System.out.println("-------------------");
		System.out.println(num1);
		System.out.println(num2);
	}

}
