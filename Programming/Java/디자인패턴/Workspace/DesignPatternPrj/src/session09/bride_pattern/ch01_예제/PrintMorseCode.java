package session09.bride_pattern.ch01_¿¹Á¦;

public class PrintMorseCode extends MorseCode {

	//	garam
	
	public PrintMorseCode g() {
		dash();dash();dot();space();
		return this;
	}
	
	public PrintMorseCode a() {
		dot();dash();space();
		return this;
	}
	public PrintMorseCode r() {
		dot();dash();dot();space();
		return this;
	}
	
	public PrintMorseCode m() {
		dash();dash();space();
		return this;
	}
	

}
