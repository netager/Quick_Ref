package com.newlecture.app.util;

public class Program {

	public static void main(String[] args) {
		Intlist list = new Intlist();
		
		list.add(3);
		list.add(5);
		
		int size = list.size();
		System.out.printf("size : %d\n", size);
		
		list.clear();
		size = list.size();
		System.out.printf("size : %d\n", size);

		list.add(7);
		int num = list.get(0);
		System.out.printf("num : %d\n", num);
		

	}

}
