package chapter12.컬렉션프레임워크.collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");

		// 정렬이 되어서 출력됨 - String은 compareTo() 구현되어 있어서 정렬되어 출력
		System.out.println(tree);
	}

}
