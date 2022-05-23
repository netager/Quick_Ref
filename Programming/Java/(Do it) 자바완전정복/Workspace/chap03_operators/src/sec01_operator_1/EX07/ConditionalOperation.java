package sec01_operator_1.EX07;

public class ConditionalOperation {

	public static void main(String[] args) {
		
		//#1. 삼항연산자
		int value1 = (3>5)? 6: 9; // 9
		System.out.println(value1);
		System.out.println("---------------------------------");
		
		int value2 = (5>3)? 10: 20; // 10
		System.out.println(value2);
		System.out.println("---------------------------------");

		// int value3 = 3;
		for(int value3 = 0; value3<10; value3++)
			System.out.printf("%d : %s, ", value3, (value3%2==0)? "짝수": "홀수");
		System.out.println();
		System.out.println("---------------------------------");
		
		//cf. if - else  구문으로 변환
		int value4 = 3;
		if(value4%2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		
	}

}
