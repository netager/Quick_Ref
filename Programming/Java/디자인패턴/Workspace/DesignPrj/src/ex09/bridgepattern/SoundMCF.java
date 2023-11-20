package ex09.bridgepattern;

public class SoundMCF implements MorseCodeFunction {

	@Override
	public void dot() {
		
		System.out.print("»å");
	}

	@Override
	public void dash() {
		
		System.out.print("»ß~");
	}

	@Override
	public void space() {
		
		System.out.print("À½");
	}

}
