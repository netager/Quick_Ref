package chapter07.¹è¿­°úarraylist.arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
//		ArrayList list = new ArrayList();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
//		for (String s : list) {
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			String s = list.get(i);
		}

	}

}
