package sec01_packageimport.EX02;


//�ٸ� ��Ű���� �ִ� Ŭ������ ������ Ȱ���ϴ� ��� #2 : ����Ʈ(import) ���

//import sec01_packageimport.common.A;
import sec01_packageimport.common.*;

public class PackageImport_2 {
	public static void main(String[] args) {
		
		//#1. ��ü����
		sec01_packageimport.common.A a = new sec01_packageimport.common.A();
		
		//#2. ��� Ȱ��
		System.out.println(a.m);	// 3
		System.out.println(a.n); 	// 4
		a.print();
	}
}
