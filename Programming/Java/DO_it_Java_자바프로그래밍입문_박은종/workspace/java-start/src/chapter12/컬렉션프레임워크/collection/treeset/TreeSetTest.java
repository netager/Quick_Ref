package chapter12.�÷��������ӿ�ũ.collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");

		// ������ �Ǿ ��µ� - String�� compareTo() �����Ǿ� �־ ���ĵǾ� ���
		System.out.println(tree);
	}

}
