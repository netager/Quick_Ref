package session09.bride_pattern.ch03_����_������ɹ�;

public class HuntingMethod2 implements HuntingHandler {

	@Override
	public void findQuarry() {

		System.out.println("���󿡼� ã�´�.");
		
	}

	@Override
	public void detectedQuarry() {

		System.out.println("��� �߰�!");
		
	}

	@Override
	public void attack() {

		System.out.println("���� ��´�.");
		
	}

}
