package quiz;

public class Quiz04 {

	public static void main(String[] args) {

		/* 
		 * 1�� -space ���� 3�� skip	
		 * 3�� - 2�� skip
		 * 5�� - 1��
		 * 5��
		 */

		int lineCount = 4;
		int starCount = 1;
		int spaceCount = lineCount/2 + 1; 
		
		for(int i=0; i<lineCount; i++) {
			for(int j=0; j<spaceCount; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<starCount; j++) {
				System.out.print("*");
			}
				
			for(int j=0; j<spaceCount; j++) {
				System.out.print(" ");
			}
			
			spaceCount -= 1;
			starCount += 2;
			System.out.println();
			
		}
	}

}
