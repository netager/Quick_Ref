package ex09.bridgepattern;

public class Main {
	public static void main(String[] args) {
		
//		PrintMorseCode code = new PrintMorseCode(new DefaultMCF());
//		PrintMorseCode code = new PrintMorseCode(new SoundMCF());
		PrintMorseCode code = new PrintMorseCode(new FlashMCF());
		
//		code.g();code.a();code.r();code.a();code.m();
		code.g().a().r().m();			// chainning
	}

}
