package chapter03.연산자;

public class OperationEx {

	public static void main(String[] args) {

		int age = 24;
		System.out.println(age);

		// 부호연산자의 특성을 잘 파악해야함. num 값을 바꾸지는 않는다.
		int num = 10;
		int num2 = -num;
		
		System.out.println(num);
		System.out.println(num2);
		
		num = -num;
		System.out.println(num);

		int num3 = 59;
		int num4 = 12;
		System.out.println(num3%num4);
		
	}

}
