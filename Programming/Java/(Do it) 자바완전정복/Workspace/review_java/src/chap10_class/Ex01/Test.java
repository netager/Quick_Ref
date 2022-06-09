package chap10_class.Ex01;

import java.util.HashMap;

class A {
	String name;
	
	A(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof A) {
			if(this.name == ((A)obj).name) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}


class B {
	String name;
	
	B(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof B) {
			if(this.name == ((B)obj).name) {
				return true;
			}
		}
		return false;
 	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}

public class Test {
	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1,  "데이터1");
		hm1.put(1,  "데이터2");
		hm1.put(2,  "데이터3");
		System.out.println(hm1);

		HashMap<A, String> hm2 = new HashMap<>();
		hm2.put(new A("첫번째"), "데이터1");
		hm2.put(new A("첫번째"), "데이터2");
		hm2.put(new A("두번째"), "데이터3");
		System.out.println(hm2);
		System.out.println("---------------------------------");
		
		HashMap<B, String> hm3 = new HashMap<>();
		hm3.put(new B("첫번째"), "데이터1");
		hm3.put(new B("첫번째"), "데이터2");
		hm3.put(new B("두번째"), "데이터3");
		System.out.println(hm3);
		System.out.println("---------------------------------");

		
		A a1 = new A("첫번째");
		
		A a2 = new A("첫번째");
		
		System.out.println(a1 + ", " + a2);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a1.equals(a2));
		System.out.println(a1 == a2);
		System.out.println();
		
		B b1 = new B("첫번째");
		B b2 = new B("첫번째");
		
		System.out.println(b1 + ", " + b2);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1.equals(b2));
		System.out.println(b1 == b2);
		System.out.println();
		
		
		
		
	}
}
