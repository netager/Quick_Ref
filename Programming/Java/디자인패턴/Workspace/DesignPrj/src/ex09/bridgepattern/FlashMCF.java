package ex09.bridgepattern;

public class FlashMCF implements MorseCodeFunction {

	@Override
	public void dot() {
		
		System.out.print("��½");
	}

	@Override
	public void dash() {
		
		System.out.print("��¦");
	}

	@Override
	public void space() {
		
		System.out.print(" - ");
	}

}
