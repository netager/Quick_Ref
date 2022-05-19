package sec01_accessmodifier.EX01.pack2;

import sec01_accessmodifier.EX01.pack1.A;

public class C {
	
	public void print() {
		A a = new A();
		
		System.out.println(a.a);	// 가능 
//		System.out.println(a.b);  	// 불가능
//		System.out.println(a.c);	// 불가능
//		System.out.println(a.d); 	// 불가능
	}

}
