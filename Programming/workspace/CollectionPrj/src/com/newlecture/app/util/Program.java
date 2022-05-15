package com.newlecture.app.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
//		GList<Integer> list = new GList<>();
//		ArrayList<Integer> list = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(7);
		list.add(7);
		
		System.out.println(list.get(5));
		System.out.println(list.size());
		
		Set<Integer> set = new HashSet<>();
		set.add(3);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(7);
		set.add(7);
		System.out.println(set.add(7));
		System.out.println(set.size());
		
		Map<String, Object> map = new HashMap<>();
		map.put("id",  3);
		map.put("title", "Hello");
		map.put("hit", 12);
		
		System.out.println(map.get("title"));
		
//		int size = list.size();
//		for(int i=0; i<size; i++)
//			System.out.printf("%d, ", list.get(i));
//		System.out.printf("size : %d\n", size);
//		
//		list.clear();
//		size = list.size();
//		System.out.printf("size : %d\n", size);
//
//		list.add(7);
//		int num = list.get(0); // Object` -> Integer
//		System.out.printf("num : %d\n", num);
		
//		num = (Integer)list.get(1);
		
	}

}
