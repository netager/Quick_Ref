package test;

import java.util.ArrayList;

public class ArrayListTesst {
	
	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<String>
		();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("--------------------------------------");
		for (int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("--------------------------------------");
				
		// 배열 사용
		String[] slist = new String[10];
		int count = 0;
		slist[0] = "abc"; count++;
		
		for (int i=0;i < count; i++) {
			System.out.println(slist[i]);
		}
		
		System.out.println("--------------------------------------");
		
		for (int i=0;i < slist.length; i++) {
			System.out.println(slist[i]);
		}
		
		
	}

}
