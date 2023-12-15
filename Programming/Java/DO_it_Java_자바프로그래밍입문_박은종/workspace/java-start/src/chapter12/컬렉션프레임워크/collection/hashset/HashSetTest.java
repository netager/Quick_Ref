package chapter12.컬렉션프레임워크.collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		boolean b1 = set.add("aaa");
		System.out.println(b1);
		set.add("bbb");
		set.add("ccc");
		
		boolean b = set.add("aaa");
		System.out.println(b);
		
		
		System.out.println(set);
		
		

	}

}
