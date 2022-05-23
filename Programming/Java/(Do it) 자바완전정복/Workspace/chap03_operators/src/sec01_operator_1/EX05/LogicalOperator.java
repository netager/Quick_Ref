package sec01_operator_1.EX05;

public class LogicalOperator {

	public static void main(String[] args) {
		//#1. 논리연산자
		//@AND (&&)
		System.out.println(true && true);  		// true
		System.out.println(true && false);		// false
		System.out.println(true && (5<3));		// false
		System.out.println((5>=5) && (7>2));	// true
		System.out.println("----------------------------------");
		
		//@OR (||)
		System.out.println(true || true);  		// true
		System.out.println(true || false);		// true
		System.out.println(false || (5<3));		// false
		System.out.println((5>=5) || (7>2));	// true
		System.out.println("----------------------------------");
		
		//@XOR (^)
		System.out.println(true ^ true);  		// false
		System.out.println(true ^ false);		// true
		System.out.println(false ^ (5<3));		// false
		System.out.println((5>=5) ^ (7>2));		// false
		System.out.println("----------------------------------");

		//@NOT (!)
		System.out.println(!true);  			// false
		System.out.println(!false);				// true
		System.out.println(false || !(5<3));	// true
		System.out.println((5<=5) || !(7>2));	// true
		System.out.println("----------------------------------");

		//#2. 비트연산자로 논리연산 수행
		System.out.println(true & true);		// true
		System.out.println(true & false);		// false
		System.out.println(true | (5<3));		// true
		System.out.println((5<=5) | (7>2));		// true
		System.out.println("----------------------------------");
		
		//@숏 서킷 사용 여부(논리연산자는 O, 비트연산자 X)
		int value1 = 3;
		System.out.println(false && value1>6); 	// false - 숏 서킷 동작 - 앞에 있는 것이 false 이므로 뒤는 안 읽음
		System.out.println(false && ++value1>6); // 숏 서킷 동작으로 ++value1 이 동작하지 않음.
		System.out.println(value1);  // 3
		System.out.println("----------------------------------");
		
		int value2 = 3;
		System.out.println(false & value2>6); 	// false - 숏 서킷 미동작 - 뒤에까지 다 읽음
		System.out.println(false & ++value2>6); // 숏 서킷 미동작으로 ++value2 이 동작함.
		System.out.println(value2);  // 4
		System.out.println("----------------------------------");

		int value3 = 3;
		System.out.println(true || value3>6); 	// true - 숏 서킷 미동작 - 뒤에까지 다 읽음
		System.out.println(true || ++value3>6); // 숏 서킷 미동작으로 ++value2 이 동작함.
		System.out.println(value3);  // 3
		System.out.println("----------------------------------");
		
		int value4 = 3;
		System.out.println(true | value4>6); 	// true - 숏 서킷 미동작 - 뒤에까지 다 읽음
		System.out.println(true | ++value4>6); // 숏 서킷 미동작으로 ++value2 이 동작함.
		System.out.println(value4);  // 4
		System.out.println("----------------------------------");

		
	}

}
