package test;

public class TwoDimessionTest {

	public static void main(String[] args) {

		// ���ĺ� 26�ڸ� 12 * 2 �迭�� �����ϰ� ����Ͻÿ�.
		
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
