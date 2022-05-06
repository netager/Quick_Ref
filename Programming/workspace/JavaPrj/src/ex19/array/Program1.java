package ex19.array;

public class Program1 {

	public static void main(String[] args) {

		int[] nums = {1,2,3,4,5,6,7};
		
		for(int i=0; i<7; i++)
			System.out.printf("%d ", nums[i]);
		System.out.println();
		
		int[] temp = new int[10];
		
		for(int i=0; i<7; i++)
			temp[i] = nums[i];
		nums = temp; // nums가 temp배열을 가리키도록 변경
		nums[7] = 8;
		
		for(int i=0; i<10; i++)
			System.out.printf("%d ", nums[i]);
		System.out.println();
		
		int[] num1 = {1,2,3};
		int[] num2 = {4,5,6};
		int[] nums1 = new int[6];
		
		for(int i=0; i<3; i++) {
			nums1[i] = num1[i];
			nums1[i+3] = num2[i];
		}
		
		for(int i=0; i<6; i++)
			System.out.printf("%d ", nums[i]);
		System.out.println();
		
		
		int[] nums10 = {5,2,7,4,6,1,3};
		for(int i=0; i<nums10.length; i++)
			if(nums10[i] == 1)
				System.out.printf("FInding Index : %d\n", i);

	}

}
