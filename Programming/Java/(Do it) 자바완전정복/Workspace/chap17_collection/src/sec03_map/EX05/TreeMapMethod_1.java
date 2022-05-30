package sec03_map.EX05;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethod_1 {
	public static void main(String[] args) {
		
		// TreeMap 내의 메서드를 사용하기 위해 TreeMap으로 정의함. Map으로 정의해도 상관 없으나 TreeMap메서드를 사용할 수 없게 됨.
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		for (int i=20; i>0; i-=2) {
			treeMap.put(i, i+"번째 데이터");
		}
		System.out.println(treeMap.toString());	//{2=2번째 데이터, 4=4번째 데이터, ... , 20=20번째 데이터}

		//#1. firstKey()
		System.out.println(treeMap.firstKey());	//2
		
		//#2. firstEntry()
		System.out.println(treeMap.firstEntry());	//2=2번째 데이터

		//#3. lastKey()
		System.out.println(treeMap.lastKey());		//20

		//#4. lastEntry()
		System.out.println(treeMap.lastEntry());	//20=20번째 데이터

		//#5. lowerKey(E element)
		System.out.println(treeMap.lowerKey(11));	//10	
		System.out.println(treeMap.lowerKey(10));	//8

		//#6. higherKey(E element)
		System.out.println(treeMap.higherKey(11));	//12
		System.out.println(treeMap.higherKey(10));	//12

		//#7. floorKey(E element)
		System.out.println(treeMap.floorKey(11));	//10
		System.out.println(treeMap.floorKey(12));	//12

		//#8. ceilingKey(E element)
		System.out.println(treeMap.ceilingKey(11));	//12
		System.out.println(treeMap.ceilingKey(12));	//12
		System.out.println("------------------------------------------------------");
		System.out.println(" ");

		//#7. pollFirstEntry()
		System.out.println(treeMap.pollFirstEntry());	// 2=2번째 데이터
		System.out.print(treeMap.toString());	// 4=4번째 데이터 ... 20=20번째 데이터
		System.out.println(" ");

		//#8. pollLastEntry()
		System.out.println(treeMap.pollLastEntry());	// 20=20번째 데이터
		System.out.print(treeMap.toString());	// 4=4번째 데이터 ... 18=18번째 데이터
		System.out.println(" ");

		//#9. SortedMap<K V> headMap(K toKey)
		SortedMap<Integer, String> sMap = treeMap.headMap(8);
		System.out.println(sMap.toString());	// [4=, 6=]
		
		//#10. NavigableMap<K V> headMap(K toKey, boolean inclusive)
		NavigableMap<Integer, String> nMap = treeMap.headMap(8, true);
		System.out.println(nMap.toString());	// [4=, 6=, 8=]
		
		nMap = treeMap.headMap(8, false);
		System.out.println(nMap.toString());	// [4=, 6=]

		//#11. SortedMap<K V> tailMap(K toKey)
		sMap = treeMap.tailMap(14);
		System.out.println(sMap.toString());	// [14=, 16=, 18=]
		
		//#12. NavigableSet<K V> tailSet(K toKey, boolean inclusive)
		sMap = treeMap.tailMap(14, false);
		System.out.println(sMap.toString());	// [16=, 18=]
				
		sMap = treeMap.tailMap(14, true);
		System.out.println(sMap.toString());	//[14=, 16=, 18=]
		
		//#13. SortedMap<K V> subMap(K fromKey, K toKey)
		sMap = treeMap.subMap(6, 10);
		System.out.println(sMap.toString());	// [6=, 8=]

		//#14. NavigableSet<K V> subSet(K toKey, boolean inclusive)		
		nMap = treeMap.subMap(6, true, 10, false);
		System.out.println(nMap.toString());	// [6=, 8=]
		
		nMap = treeMap.subMap(6, false, 10, true);
		System.out.println(nMap.toString());	// [8=, 10=]

		//#15. NavigableSet<K> descendingKeySet()
		System.out.println(treeMap);			// {4=4번째 데이터, 6=6번째 데이터, ..., 18=18번째 데이터}
		NavigableSet<Integer> navigableSet = treeMap.descendingKeySet();
		System.out.println(navigableSet.toString());		// [18, 16, 14, 12, 10, 8, 6, 4]
		System.out.println(navigableSet.descendingSet());	// [4, 6, 8, 10, 12, 14, 16, 18]
		
		//#16. NavigableMap<K V> descendingMap()
		System.out.println(treeMap);				// {4=4번째 데이터, 6=6번째 데이터, ..., 18=18번째 데이터}
		nMap = treeMap.descendingMap();
		System.out.println(nMap.toString());		// {18=18번째 데이터, 16=16번째 데이터, ..., 4=4번째 데이터}
		System.out.println(nMap.descendingMap());	// {4=4번째 데이터, 6=6번째 데이터, ..., 18=18번째 데이터}

	}
}
