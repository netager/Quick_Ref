package session09.bride_pattern.ch03_예제_동물사냥법;

public class Bird extends Animal {

	public Bird(HuntingHandler hunting) {
		super(hunting);

	}
	
	public void hunt() {
		System.out.println("새의 사냥방식");
		findQuarry();
		detectedQuarry();
		attack();
		
	}

}
