package sec04_controlkeywork.EX02;

public class ContinueControlKeyword {

	public static void main(String[] args) {
		
		//#1. 단일 loop에서의 continue 
		for (int i = 0; i < 10; i++) {
			continue;
//			System.out.print(i+" ");
		}  
		System.out.println();

		for (int i = 0; i < 10; i++) {
			System.out.print(i+" ");
			continue;
		} 
		System.out.println();

		
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i + " ");
		} // 0, 1, 2, 3, 4, 6, 7, 8, 9 
		System.out.println();
		System.out.println();

		// #2. 다중(이중 루프에서의 continue)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					continue;
				}
				System.out.println(i + ", " + j);

			}
		}
		System.out.println();
		
		
		POS1: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					continue POS1;
				}
				System.out.println(i + ", " + j);

			}
		}
		System.out.println();
				
	}

}
