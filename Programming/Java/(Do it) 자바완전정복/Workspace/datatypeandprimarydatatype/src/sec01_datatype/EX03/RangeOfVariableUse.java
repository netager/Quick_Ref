package sec01_datatype.EX03;

public class RangeOfVariableUse {
	public static void main(String[] args) {
		
		int value1 = 3;
		
		if(value1>0) {
			int value2 = 5;
			System.out.println(value1); // 3
			System.out.println(value2); // 5
		}

		System.out.println(value1);		// 3
//		System.out.println(value2);		// 오류 - 변수의 생명주기 
		
		
	}

}
