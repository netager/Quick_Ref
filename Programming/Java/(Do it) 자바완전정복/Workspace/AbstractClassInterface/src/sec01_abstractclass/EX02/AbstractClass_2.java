package sec01_abstractclass.EX02;

//�߻�Ŭ������ ��ü ���� ��� #2(�͸� �̳�Ŭ���� �����Ͽ� ��ü ����)

abstract class A {
	abstract void abc();
}


public class AbstractClass_2 {
	public static void main(String[] args) {
		
		//#1. ��ü ����
		A a1 = new A() {
			void abc() {
				System.out.println("���#2. �͸� �̳�Ŭ���� ������� ��ü ����");
			}
		};
		
		
		A a2 = new A() {
			void abc() {
				System.out.println("���#2. �͸� �̳�Ŭ���� ������� ��ü ����");
			}
		};

		//#2. �޼��� ȣ��  
		a1.abc();
		a2.abc();
			
	} // main
}
