package sec01_abstractclass.EX01;

// �߻�Ŭ������ ��ü ���� ��� #1(�ڽ�Ŭ���� ���� + �ڽ�Ŭ���� �����ڸ� ������ ��ü ����)
abstract class A {
	abstract void abc();
}

class B extends A {
	@Override
	void abc() {
		System.out.println("���#1. �ڽ�Ŭ���� ���� �� �߻�޼��� ����");
	}
}

public class AbstractClass_1 {
	public static void main(String[] args) {
	
		//#1. ��ü ����
		//	A a = new A(); //�Ұ���. abstract Ŭ������ �̿ϼ� �޼��带 ������ �ֱ� ������ ��ü ���� �� ����
		A a1 = new B();
		A a2 = new B();
		
		B b1 = new B();
		B b2 = new B();
		
		//#2. �޼��� ȣ��
		a1.abc();
		a2.abc();
		b1.abc(); //���#1. �ڽ�Ŭ���� ���� �� �߻�޼��� ����
		b2.abc();	
	}
}
