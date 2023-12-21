package session09.bride_pattern.ch02_¿¹Á¦_°³¼±;

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
