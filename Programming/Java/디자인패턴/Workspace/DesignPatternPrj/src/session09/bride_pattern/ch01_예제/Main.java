package session09.bride_pattern.ch01_����;

public class Main {

	public static void main(String[] args) {

		PrintMorseCode code = new PrintMorseCode();
		
		code.g();code.a();code.r();code.a();code.m();
		System.out.println();
		System.out.println("-------------------------");

		code.g().a().r().a().m();
	}

}
