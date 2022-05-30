package sec02_set.EX06;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSummary {
	public static void main(String[] args) {
		
		//#1. HashSet
		Set<String> hashSet = new HashSet<>();
		hashSet.add("다");
		hashSet.add("마");
		hashSet.add("나");
		hashSet.add("가");
		System.out.println(hashSet.toString()); // [jvm 맘데로 ]
		
		//#2. LinkedHashSet
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("다");
		linkedHashSet.add("마");
		linkedHashSet.add("나");
		linkedHashSet.add("가");
		System.out.println(linkedHashSet.toString()); // [다, 마, 나, 가] - 들어온 순서데로
		
		//#3. TreeSet
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("다");
		treeSet.add("마");
		treeSet.add("나");
		treeSet.add("가");
		System.out.println(treeSet.toString()); // [가, 나, 다, 마] - 사전 순서데로
		
	} //main
} //class
