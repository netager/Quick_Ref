package session09.bride_pattern.ch03_예제_동물사냥법;

public class HuntingMethod2 implements HuntingHandler {

	@Override
	public void findQuarry() {

		System.out.println("지상에서 찾는다.");
		
	}

	@Override
	public void detectedQuarry() {

		System.out.println("노루 발견!");
		
	}

	@Override
	public void attack() {

		System.out.println("물어 뜯는다.");
		
	}

}
