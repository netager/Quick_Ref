package chapter2;

public class ImplicitConversion {
	public static void main(String[] args) {
		
		byte bNum = 10;
		int num = bNum;    // ������ ���� ���� 
		
		System.out.println(num);
		
		long lNum = 10;    // �ڵ� ����ȯ�� �߻�
		float fNum = lNum; // �ڿ������� ����ȯ �߻� 
		
		System.out.println(fNum);
		
		double dNum = fNum + num; // num�� float�� ����ȯ�ǰ� ��ģ ����� double�� ����ȯ 
		System.out.println(dNum);
		
	}

}
