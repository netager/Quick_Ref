package chapter02.변수와자료형;

public class ImplicitConversion {

	public static void main(String[] args) {

		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		long lNum = 10;		// 묵시적 형변환
		float fNum = lNum;	// 묵시적 형변환
		
		System.out.println(fNum);
		
		double dNum = fNum + num; //묵시적 형변환
		System.out.println(dNum);
		
		double dNum1 = 3.14;
		int num1 = (int)dNum1;
		System.out.println((num1));
		

	}

}
