package sec01_list.EX04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorMethod {
	public static void main(String[] args) {
		
		List<Integer> vector1 = new Vector<Integer>();
		
		//#1. add(E element)
		vector1.add(3);
		vector1.add(4);
		vector1.add(5);
		System.out.println(vector1); // .toString()이 생략됨.
		System.out.println(vector1.toString());
		
		//#2. add(int index, E element)
		vector1.add(1, 6); // [3, 6, 4, 5]
		System.out.println(vector1);
		
		//#3. addAll(또다른 리스트 객체)
		List<Integer> vector2 = new Vector<>();
		vector2.add(1);
		vector2.add(2);
		System.out.println(vector2);
		vector2.addAll(vector1);	// [1, 2, 3, 6, 4, 5]
		System.out.println(vector2);
		
		//#4. addAll(int index, 또다른 리스트 객체)
		List<Integer> vector3 = new Vector<>();
		vector3.add(1);
		vector3.add(2);
		vector3.addAll(1,vector3); // [1, 1, 2, 2]
		System.out.println(vector3);
		
		//#5. set(int index, E element)
		vector3.set(1, 5);	// [1, 5, 2, 2]
		vector3.set(3, 6);	// [1, 5, 2, 6]
//		vector3.set(4, 7);	// System.out.println(vector3); // Exception Occured - IndexOutOfBoundsException
		
		//#6. remove(int index)
		vector3.remove(1);				
		System.out.println(vector3);		// [1, 2, 6] - 1번 인덱스 삭제
		
		//#7. remove(Object o)
		vector3.remove((Integer) 2); 	
		System.out.println(vector3);		//  [ 1, 6]

		vector3.remove(new Integer(6)); 	
		System.out.println(vector3);		//  [ 1 ]

		//#8. clear()
		vector3.clear(); 	
		System.out.println(vector3);		//  [ ]

		//#9. isEmpty()
		System.out.println(vector3.isEmpty());	// true

		//#10. size()
		System.out.println(vector3.size());	// 0
		vector3.add(1);
		vector3.add(2);
		vector3.add(3);
		System.out.println(vector3.size());	// 3
		
		//#11. get(int index)
		System.out.println("0번째 : " + vector3.get(0));	// 1
		System.out.println("1번째 : " + vector3.get(1));	// 2
		System.out.println("2번째 : " + vector3.get(2));	// 3
		
		for (int i=0; i<vector3.size(); i++) 
			System.out.println(i+"번째 : " + vector3.get(i));
		
		//#12. toArray() List ---> Array : Object 객체타입으로 반환
		Object[] object = vector3.toArray();
		System.out.println(Arrays.toString(object));

		//#13-1. toArray(T[] t) ---> T[]
		Integer[] integer2 = vector3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer2));

		//#13-2. toArray(T[] t) ---> T[]
		Integer[] integer1 = vector3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer1));
		

		
	}
}
