package sec01_finalmodifier.EX02;

class A {
	void abc() {}
	final void bcd() {};
}

class B extends A {
	void abc() {}
//	void bcd() {}	// final �޼���� �������̵� �Ұ�
}

final class C {}

//class D extends C {}	// final Ŭ������ ��� �Ұ�


public class FinalModifier_2 {

}
