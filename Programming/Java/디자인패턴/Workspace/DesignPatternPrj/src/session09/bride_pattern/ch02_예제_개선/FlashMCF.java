package session09.bride_pattern.ch02_예제_개선;

public class FlashMCF implements MorseCodeFunction {

	@Override
	public void dot() {
		System.out.print("*");
		
	}

	@Override
	public void dash() {
		System.out.print("-*-");
		
	}

	@Override
	public void space() {
		System.out.print(" ");
		
	}

}
