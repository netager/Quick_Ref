package sec02_loopcontrolstatement.EX02;

public class WhileControlStatement {

	public static void main(String[] args) {
		
		//#1. while의 기본문법 구조
		int a = 0;
		while(a<10) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		System.out.println("--------------------------");
		
		 		
		int b=10;
		while(b>0) {
			System.out.print(b + " ");
			b--;
		}
		System.out.println();
		System.out.println("--------------------------");
		
		//@for문으로 변환
		for(int i=10; i>0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("--------------------------");
		
		//#2. while의 특수한 형태(무한루프)
//		while(true) {
//			System.out.println("무한루프");
//		}
		
		//#3. 무한루프 탈출하기
		int c = 0;
		while(true) {
			if(c>10) {
				break;
			}
			System.out.print(c+" ");
			c++;
		}
		System.out.println();
		System.out.println("--------------------------");
	}
}
