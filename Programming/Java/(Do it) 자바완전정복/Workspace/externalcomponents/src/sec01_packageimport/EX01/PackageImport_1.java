package sec01_packageimport.EX01;

public class PackageImport_1 {
	public static void main(String[] args) {
		
		//#1. ��ü����
		sec01_packageimport.common.A a = new sec01_packageimport.common.A();
		
		
		//#2. ��� Ȱ��
		System.out.println(a.m);	// 3
		System.out.println(a.n); 	// 4
		a.print();
	}

}
