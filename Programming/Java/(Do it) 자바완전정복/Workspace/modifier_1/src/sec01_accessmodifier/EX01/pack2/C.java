package sec01_accessmodifier.EX01.pack2;

import sec01_accessmodifier.EX01.pack1.A;

public class C {
	
	public void print() {
		A a = new A();
		
		System.out.println(a.a);	// ���� 
//		System.out.println(a.b);  	// �Ұ���
//		System.out.println(a.c);	// �Ұ���
//		System.out.println(a.d); 	// �Ұ���
	}

}
