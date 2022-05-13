package com.newlecture.app.util;

public class Intlist {
	
	private int[] nums;
	private int current;
	
	public Intlist() {
		nums = new int[3];
		current = 0;
	}

	public void add(int num) {
		nums[0] = num;
		current++;
		
	}

	public void clear() {
//		for(int i=0; i<current; i++)
//			nums[i] = 0;
//		nums = new int[3];
		
		current = 0;
		
	}

	public int size() {
		return current;
	}

	public int get(int index) {
		if(current <= index)
			throw new IndexOutOfBoundsException();
		return nums[index];
	}

}
