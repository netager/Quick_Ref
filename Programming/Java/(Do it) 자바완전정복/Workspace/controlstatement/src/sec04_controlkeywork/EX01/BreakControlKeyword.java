package sec04_controlkeywork.EX01;

public class BreakControlKeyword {

	public static void main(String[] args) {
		
		//#1. ���� loop break Ż�� 
		for(int i=0; i<10; i++) {
			System.out.println(i);
			break;
		} // 0
		
		for(int i=0; i<10; i++) {
			if(i==5) {
				break;
			}
			System.out.print(i + " ");
		} // 0, 1, 2, 3, 4
		System.out.println();
		System.out.println();
		
		
		//#2. ����(����) loop break Ż��
		//@case1. �ϳ��� �ݺ����� Ż���ϴ� ���
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2) {
					break;
				}
				System.out.println(i+", "+j);
				
			}
		}
		System.out.println();
		
		//@case2. ���� �ݺ����� �ѹ��� Ż���ϴ� ���(break LABLE)
		POS1: for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2) {
					break POS1;
				}
				System.out.println(i+", "+j);
				
			}
		}
		System.out.println();
		
		//@case3. ���� �ݺ����� �ѹ��� Ż���ϴ� ���(�������� ����)
		// �Ϲ������� �������� �����Ͽ� ���� �ݺ����� Ż���Ѵ�.
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2) {
					i=100;
					break;
				}
				System.out.println(i+", "+j);
				
			}
		}
		System.out.println();
		
		
		
	}

}
