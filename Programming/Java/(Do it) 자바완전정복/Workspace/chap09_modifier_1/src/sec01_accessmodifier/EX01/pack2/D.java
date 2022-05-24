package sec01_accessmodifier.EX01.pack2;

import sec01_accessmodifier.EX01.pack1.A;

public class D extends A { 		// D클래스는 A클래스의 자식 클랙스이다.

	public void print() {
		
		System.out.println(a);	// 가능 
		System.out.println(b);  // 가능
//		System.out.println(c);	// 불가능
//		System.out.println(d); 	// 불가능
	}
}
