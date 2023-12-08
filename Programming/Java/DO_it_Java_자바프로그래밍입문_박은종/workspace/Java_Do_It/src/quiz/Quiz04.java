package quiz;

public class Quiz04 {

	public static void main(String[] args) {

		/* 
		 * 1개 -space 개수 3개 skip	
		 * 3개 - 2개 skip
		 * 5개 - 1개
		 * 5개
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
