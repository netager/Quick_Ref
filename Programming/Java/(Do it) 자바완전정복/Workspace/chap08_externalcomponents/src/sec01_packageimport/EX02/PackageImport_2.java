package sec01_packageimport.EX02;


//다른 패키지에 있는 클래스를 가져와 활용하는 방법 #2 : 임포트(import) 사용

//import sec01_packageimport.common.A;
import sec01_packageimport.common.*;

public class PackageImport_2 {
	public static void main(String[] args) {
		
		//#1. 객체생성
		sec01_packageimport.common.A a = new sec01_packageimport.common.A();
		
		//#2. 멤버 활용
		System.out.println(a.m);	// 3
		System.out.println(a.n); 	// 4
		a.print();
	}
}
