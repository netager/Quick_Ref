package chapter07.배열과arraylist.다차원배열;

public class TwoDimensionArray {

	public static void main(String[] args) {
 
		int[][] arr = {{1,2,3}, {4,5,6}};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		for (int i=0; i<arr.length; i++)
			for (int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		
		char[][] alphs = new char[13][2];
		char chr = 'A';
		int num = 65;
		for (int i=0; i<alphs.length; i++)
			for(int j=0; j<alphs[i].length; j++) {
				alphs[i][j] = (char)num;
				num++;
			}
		
		for (int i=0; i<alphs.length; i++)
			for(int j=0; j<alphs[i].length; j++) {
				System.out.print(alphs[i][j]);
				
			}
		System.out.println();
		
	}

}
