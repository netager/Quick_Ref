package ex19.array;

public class Program3 {

	public static void main(String[] args) {
		
		int[] nums = {5,1,7,4,6,1,3};
		
		for(int i=0; i<nums.length; i++)
			if (nums[i] == 1) {
				System.out.printf("idx: %d, value: %d ", i, nums[i]);
			}

		System.out.println();
		
		for(int i=0; i<nums.length; i++)
			if (nums[i] == 1) {
				System.out.printf("idx: %d, value: %d ", i, nums[i]);
				break;
			}

	}

}
