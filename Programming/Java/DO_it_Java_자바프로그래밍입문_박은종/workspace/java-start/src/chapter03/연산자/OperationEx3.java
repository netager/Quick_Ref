package chapter03.������;

public class OperationEx3 {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value = (((num1 = num1 + 10) < 10) && ((i = i+2) > 10));
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);

		num1 = 10;
		i = 2;

		boolean value1 = (((num1 = num1 + 10) < 10) || ((i = i+2) > 10));
		System.out.println(value1);
		System.out.println(num1);
		System.out.println(i);

	}

}
