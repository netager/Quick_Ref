package sec01_operator_1.EX04;

public class RelationOperator {

	public static void main(String[] args) {
		
		//#1. 크기비교(<, >, <-, >=) : true, false
		System.out.println(5<2);
		System.out.println(5>2);
		System.out.println(5<5);
		System.out.println(5<=5);
		System.out.println(5>=5);
		System.out.println("--------------------------------");
		
		//#2. 등가비교(==, !=) : true, false
		System.out.println(5==2);
		System.out.println(5!=2);
		System.out.println(5==5);
		System.out.println(5!=5);
		System.out.println("--------------------------------");
		
		//@ 참조자료형 등가비교
		// stack 메모리에 값의 메모리 주소값을 저장하고 있음.
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1 == str2); // false - str1 과 str2가 저장하고 있는 메모리 주소가 다름
		
	}

}
