package session09.bride_pattern.ch02_예제_개선;

public class MorseCode {
	private MorseCodeFunction function;
	
	public MorseCode(MorseCodeFunction function) {

		this.function = function;
	}
	
	public void setFunction(MorseCodeFunction function) {
		this.function = function;
	}
	
	public void dot() {
		function.dot();
		
	}
	public void dash() {
		function.dash();

	}
	public void space() {
		function.space();

	}

}
