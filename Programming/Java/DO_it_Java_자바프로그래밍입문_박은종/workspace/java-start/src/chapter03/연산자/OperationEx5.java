package chapter03.¿¬»êÀÚ;

public class OperationEx5 {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 10;
		
		int result = num1 & num2;
		System.out.println(result);
		
		result = num1 | num2;
		System.out.println(result);
		
		result = ~num1;
		System.out.println(result);
		
		int num3 = 5;	// 00000101
		System.out.println(num3<<1);
		System.out.println(num3);

		System.out.println(num3<<=1);
		System.out.println(num3);

		num3 = 5;
		System.out.println(num3<<2);
		System.out.println(num3);

		System.out.println(num3<<=2);
		System.out.println(num3);

		num3 = 5;
		System.out.println(num3<<3);
		System.out.println(num3);

		System.out.println(num3<<=3);
		System.out.println(num3);
		
		num3 = 5;	// 00000101
		System.out.println(num3>>1);
		System.out.println(num3);
		System.out.println(num3>>2);
		System.out.println(num3>>3);
		System.out.println(num3);


	}

}
