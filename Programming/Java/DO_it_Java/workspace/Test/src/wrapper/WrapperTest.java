package wrapper;

public class WrapperTest {

	public static void main(String[] args) {

		Integer i = 1;
		Integer I = new Integer(100);
		
		int sum = i + I;
		
		System.out.println(i + "," + I);
		System.out.println(i + "+" + I + "=" + (i + I));
		System.out.println(i + "+" + I + "=" + sum
				);
		
	}

}
