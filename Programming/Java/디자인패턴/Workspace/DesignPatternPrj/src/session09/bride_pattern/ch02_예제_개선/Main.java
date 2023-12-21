package session09.bride_pattern.ch02_예제_개선;

public class Main {

	public static void main(String[] args) {

//		PrintMorseCode code = new PrintMorseCode(new DefaultMCF());
//		PrintMorseCode code = new PrintMorseCode(new SoundMCF());
		PrintMorseCode code = new PrintMorseCode(new FlashMCF());
		
		
		code.g();code.a();code.r();code.a();code.m();
		System.out.println();
		System.out.println("-------------------------");

		code.g().a().r().a().m();
	}

}
