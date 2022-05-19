package sec01_accessmodifier.EX01;

import sec01_accessmodifier.EX01.pack1.A;
import sec01_accessmodifier.EX01.pack1.B;
import sec01_accessmodifier.EX01.pack2.C;
import sec01_accessmodifier.EX01.pack2.D;

public class AccessModifierMember {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		a.print();
		System.out.println("-------------------------------");
		b.print();
		System.out.println("-------------------------------");
		c.print();
		System.out.println("-------------------------------");
		d.print();
		
	}

}
