package ex08_01.sample_gugu;

public class Program {

	static int[] gugu(int dan) {
		
		int[] result = new int[9];
		
		for (int i=0; i<result.length;i++) {
			result[i] = dan * (i+1);
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] result = gugu(3);
		
		for (int value: result) {
			System.out.println(value);
		}

	}

}
