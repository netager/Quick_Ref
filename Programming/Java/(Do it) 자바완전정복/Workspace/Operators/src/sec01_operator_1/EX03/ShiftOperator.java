package sec01_operator_1.EX03;

public class ShiftOperator {

	public static void main(String[] args) {
		
		//#1. 산술쉬프트(부호변화가 없음 *2, /2효과)
		//@<< left shift (*2) 왼쪽으로 이동하면서 오른쪽은 0으로 채운다. 단, 부호비트는 유지
		System.out.println(3<<1);	//   6
		System.out.println(-3<<1);	//  -6
		System.out.println(3<<2);	//  12
		System.out.println(-3<<2);	// -12
		System.out.println("---------------------------------");
		
		//@>> right shift (/2) 오른쪽으로 이동하면서 왼쪽은 부호비트값으로 채운다. 단, 부호비트는 유지
		System.out.println(5>>1);	//   2
		System.out.println(-5>>1);	//  -3 : -2.5이나 -의 경우 올림하여 -3
		System.out.println(5>>2);	//   1
		System.out.println(-5>>2);	//  -2 : -1.25이나 -의 경우 올림하여 -2
		System.out.println("---------------------------------");
		
		//#2. 논리쉬프트(>>>) - 부호까지 변경. 통째로 옮기겠다.왼쪽은 0으로 채운다
		// 오른쪽 쉬프트만 존재
		System.out.println(3>>>1);	//0000...0011 -> 1
		System.out.println(-3>>>31);	//1111...1101 -> 1

	}

}
