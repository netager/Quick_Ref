package assignment;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		// 단락회로평가 방식으로 연산이 됨.
		// 앞의 항이 false이므로 뒤에 항은 연산 안됨
		// 결과값은 false
		boolean value = ((num1=num1+10) < 10) && ((i=i+2) <10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);

		// 단락회로평가 방식으로 연산이 됨.
		// 앞의 항이 true이므로 뒤에 항은 연산 안됨
		// 결과값은 true
		value = ((num1=num1+10) > 10) || ((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}
}
