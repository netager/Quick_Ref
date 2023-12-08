package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		boolean b1 = set.add("aaa");
		System.out.println("1:" + b1);
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		System.out.println("2:" + set);
		
		boolean b = set.add("aaa");
		System.out.println("3:" + b);
		
		System.out.println(set);
		
	}

}
