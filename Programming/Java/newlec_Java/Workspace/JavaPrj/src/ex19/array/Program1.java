package ex19.array;

public class Program1 {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6,7};
		
		for(int i=0; i<nums.length; i++)
			System.out.printf("[%d, %d] ", i, nums[i]);
		System.out.println();
		
		int[] temp = new int[10];
		
		for(int i=0; i<nums.length; i++)
			temp[i] = nums[i];
		
		nums = temp;
		nums[7] = 1000;
		
		for(int i=0; i<nums.length; i++)
			System.out.printf("[%d, %d] ", i, nums[i]);
		System.out.println();
		
	}

}
