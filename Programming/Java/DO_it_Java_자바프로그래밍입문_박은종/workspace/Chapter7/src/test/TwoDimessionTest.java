package test;

public class TwoDimessionTest {

	public static void main(String[] args) {

		// 알파벳 26자를 12 * 2 배열에 저장하고 출력하시요.
		
		char[][] charArr = new char[13][2];
		char chr = 'A';
		
		for (int i = 0; i < charArr.length; i++) {
			for(int j = 0; j < charArr[i].length; j++, chr++) {
				charArr[i][j] = chr;
			}
		}
		
		for (int i = 0; i < charArr.length; i++) {
			for(int j = 0; j < charArr[i].length; j++) {
				System.out.println(charArr[i][j]);
			}
		}

	}

}
