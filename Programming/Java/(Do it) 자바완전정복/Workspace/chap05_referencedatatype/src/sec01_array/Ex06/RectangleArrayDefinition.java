package sec01_array.Ex06;

public class RectangleArrayDefinition {

	public static void main(String[] args) {
		
		//#1. 2차원 배열의 선언 방법1
		int[][] array1 = new int[3][4];
		int[][] array2;
		array2 = new int[3][4];
		
		//#2. 2차원 배열의 선언 방법2
		int array3[][] = new int[3][4];
		int array4[][];
		array4 = new int[3][4];
		

		//#3. 2차원 배열의 선언 방법3
		// 사용은 가능하지만 사용하지 않는 것이 좋음.
		int[] array5[] = new int[3][4];
		int[] array6[];
		array6 = new int[3][4];

		
		//#4. 다양한 2차원 배열 선언(기본자료형 배열, 참조지료형 배열)
		boolean[][] array7 = new boolean[3][4];
		int[][] array8 = new int[2][4];
		double[][] array9 = new double[3][5];
		String[][] array10 = new String[2][6];
		

	}

}
