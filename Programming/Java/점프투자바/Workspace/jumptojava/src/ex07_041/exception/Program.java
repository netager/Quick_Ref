package ex07_041.exception;

class FoolException extends RuntimeException {
	
	
}


public class Program { 	
	
//	public void sayNick(String nick) {
//		if(nick.equals("바보")) {
//			throw new FoolException();
//		}
//		
//		System.out.println("당신의 별명은 "+nick+" 입니다.");
//	}


//	public void sayNick(String nick) {
//
//		try {
//			if(nick.equals("바보")) {
//				throw new FoolException();
//			}
//			System.out.println("당신의 별명은 "+nick+" 입니다.");
//		} catch(FoolException e) {
//			System.err.println("FoolException이 발생했습니다.");
//		}
//		
//	}

	public void sayNick(String nick) {

		try {
			if(nick.equals("바보")) {
				throw new FoolException();
			}
			System.out.println("당신의 별명은 "+nick+" 입니다.");
		} catch(FoolException e) {
			System.err.println("FoolException이 발생했습니다.");
		}
		
	}

	public static void main(String[] args) {
		
		Program program = new Program();
		
			program.sayNick("바보");
			program.sayNick("야호");
		
	}
	
}
