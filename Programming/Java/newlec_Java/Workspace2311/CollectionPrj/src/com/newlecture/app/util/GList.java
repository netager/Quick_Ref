package com.newlecture.app.util;

public class GList<T> {
	
	private Object[] nums;
	private int current;
	private int capacity;
	private int amount;
	
	public GList() {
		
		current = 0;		
		capacity = 3;
		amount = 5;
		
		nums = new Object[capacity];

	}

	public void add(T num) {
		
		System.out.printf("capacity: %d, current: %d\n", capacity, current);

		if (capacity <= current) {
			capacity += amount;
			Object[] temp = new Object[capacity];
			
			for(int i=0; i<3; i++)
				temp[i] = nums[i];

			nums = temp;
		}
		
		nums[current] = num;
		current++;
		
	}

	public void clear() {

		current = 0;
	}

	public int size() {

		return current;
	}

	public T get(int index) {

		if (current <= index)
			throw new IndexOutOfBoundsException();
		
		return (T)nums[index];
	}

}
