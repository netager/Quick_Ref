package sec02_set.EX05;

import java.util.Comparator;
import java.util.TreeSet;

class MyClass {
	int data1;
	int data2;
	
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
}

class MyComparableClass implements Comparable<MyComparableClass> {
	int data1;
	int data2;
	
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	public int compareTo(MyComparableClass o) {	//크기비교의 기준을 여기서 실행(음수, 0, 양수)
		if (data1<o.data1) return -1;
		else if (data1 == o.data1) return 0;
		else return 1;
		
	}
}

class MyComparableClass1 implements Comparable<MyComparableClass1> {
	int data1;
	int data2;
	
	public MyComparableClass1(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	public int compareTo(MyComparableClass1 o) {	//크기비교의 기준을 여기서 실행(음수, 0, 양수)
		if (data1<o.data1) return 1;
		else if (data1 == o.data1) return 0;
		else return -1;
		
	}
}


public class TreeSetMethod_2 {
	public static void main(String[] args) {
		
		//#1. Integer 크기 비교
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		Integer intValue1 = 20;
		Integer intValue2 = 10;
		treeSet1.add(intValue1);
		treeSet1.add(intValue2);
		System.out.println(treeSet1);
		
		//#2. String 크기 비교
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str2 = "다라";
		String str1 = "가나";
		treeSet2.add(str1);
		treeSet2.add(str2);
		System.out.println(treeSet2);	//사전순으로 크기가 정해짐
		
		//#3. MyClass 객체 크기 비교
//		TreeSet<MyClass> treeSet3 = new TreeSet<MyClass>();
//		MyClass myClass1 = new MyClass(2, 5);
//		MyClass myClass2 = new MyClass(3, 3);
//		
//		treeSet3.add(myClass1);
//		treeSet3.add(myClass2);
//		System.out.println(treeSet3.toString());	//

		//#4-1. MyComparableClass 객체 크기 비교
		TreeSet<MyComparableClass> treeSet4 = new TreeSet<MyComparableClass>();
		MyComparableClass myComparableClass1 = new MyComparableClass(2, 5);
		MyComparableClass myComparableClass2 = new MyComparableClass(3, 3);
		
		treeSet4.add(myComparableClass1);
		treeSet4.add(myComparableClass2);
		for(MyComparableClass mcc : treeSet4) {
			System.out.println(mcc.data1);
		}
		
		//#4-2. MyComparableClass1객체 크기 비교
		TreeSet<MyComparableClass1> treeSet5 = new TreeSet<MyComparableClass1>();
		MyComparableClass1 myComparableClass11 = new MyComparableClass1(2, 5);
		MyComparableClass1 myComparableClass12 = new MyComparableClass1(3, 3);
		
		treeSet5.add(myComparableClass11);
		treeSet5.add(myComparableClass12);
		for(MyComparableClass1 mcc : treeSet5) {
			System.out.println(mcc.data1);
		}

		//#5. MyClass 객체 크기 비교 - TreeSet<MyClass> treeSet6 = new TreeSet<MyClass>(비교기준 제공);
		TreeSet<MyClass> treeSet6 = new TreeSet<MyClass>(new Comparator<MyClass>() {
			@Override
			public int compare(MyClass o1, MyClass o2) {
				if (o1.data1<o2.data1) return -1;
				else if (o1.data1 == o2.data1) return 0;
				else return 1;
			}
			
		});

		MyClass myClass1 = new MyClass(2, 5);
		MyClass myClass2 = new MyClass(3, 3);
		
		treeSet6.add(myClass1);
		treeSet6.add(myClass2);
		for(MyClass mcc : treeSet6) {
			System.out.println(mcc.data1);
		}
		
		

	}

}
