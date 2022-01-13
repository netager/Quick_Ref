package chapter2;

public class ImplicitConversion {
	public static void main(String[] args) {
		
		byte bNum = 10;
		int num = bNum;    // 문제가 되지 않음 
		
		System.out.println(num);
		
		long lNum = 10;    // 자동 형변환이 발생
		float fNum = lNum; // 자연스럽게 형변환 발생 
		
		System.out.println(fNum);
		
		double dNum = fNum + num; // num이 float로 형변환되고 합친 결과가 double로 형변환 
		System.out.println(dNum);
		
	}

}
