package chapter02.�������ڷ���;

public class ImplicitConversion {

	public static void main(String[] args) {

		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		long lNum = 10;		// ������ ����ȯ
		float fNum = lNum;	// ������ ����ȯ
		
		System.out.println(fNum);
		
		double dNum = fNum + num; //������ ����ȯ
		System.out.println(dNum);
		
		double dNum1 = 3.14;
		int num1 = (int)dNum1;
		System.out.println((num1));
		

	}

}
