package session09.bride_pattern.ch02_����_����;

public class DefaultMCF implements MorseCodeFunction {

	@Override
	public void dot() {
		System.out.print(".");
		
	}

	@Override
	public void dash() {
		System.out.print("-");
		
	}

	@Override
	public void space() {
		System.out.print(" ");
		
	}
	

}
