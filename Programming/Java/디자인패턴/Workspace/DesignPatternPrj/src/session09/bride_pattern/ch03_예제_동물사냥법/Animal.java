package session09.bride_pattern.ch03_����_������ɹ�;

public class Animal {
	
	private HuntingHandler hunting;
	
	public Animal(HuntingHandler hunting) {

		this.hunting = hunting;
	}
	
	public void findQuarry() {
		hunting.findQuarry();
	}
	
	public void detectedQuarry() {
		hunting.detectedQuarry();
	}

	public void attack() {
		hunting.attack();
	}
	
	public void hunt() {
		findQuarry();
		detectedQuarry();
		attack();
	}

}
