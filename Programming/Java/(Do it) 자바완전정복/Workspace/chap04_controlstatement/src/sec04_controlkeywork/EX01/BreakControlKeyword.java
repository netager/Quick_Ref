package sec04_controlkeywork.EX01;

public class BreakControlKeyword {

	public static void main(String[] args) {
		
		//#1. 단일 loop break 탈출 
		for(int i=0; i<10; i++) {
			System.out.println(i);
			break;
		} // 0
		
		for(int i=0; i<10; i++) {
			if(i==5) {
				break;
			}
			System.out.print(i + " ");
		} // 0, 1, 2, 3, 4
		System.out.println();
		System.out.println();
		
		
		//#2. 다중(이중) loop break 탈출
		//@case1. 하나의 반복문만 탈출하는 경우
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2) {
					break;
				}
				System.out.println(i+", "+j);
				
			}
		}
		System.out.println();
		
		//@case2. 다중 반복문을 한번에 탈출하는 방법(break LABLE)
		POS1: for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2) {
					break POS1;
				}
				System.out.println(i+", "+j);
				
			}
		}
		System.out.println();
		
		//@case3. 다중 반복문을 한번에 탈출하는 방법(변수값을 조정)
		// 일반적으로 변수값을 조정하여 이중 반복문을 탈출한다.
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2) {
					i=100;
					break;
				}
				System.out.println(i+", "+j);
				
			}
		}
		System.out.println();
		
		
		
	}

}
