package session09.bride_pattern.ch03_����_������ɹ�;

public class Bird extends Animal {

	public Bird(HuntingHandler hunting) {
		super(hunting);

	}
	
	public void hunt() {
		System.out.println("���� ��ɹ��");
		findQuarry();
		detectedQuarry();
		attack();
		
	}

}
