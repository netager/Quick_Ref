package ex07_041.exception;

class FoolException extends RuntimeException {
	
	
}


public class Program { 	
	
//	public void sayNick(String nick) {
//		if(nick.equals("�ٺ�")) {
//			throw new FoolException();
//		}
//		
//		System.out.println("����� ������ "+nick+" �Դϴ�.");
//	}


//	public void sayNick(String nick) {
//
//		try {
//			if(nick.equals("�ٺ�")) {
//				throw new FoolException();
//			}
//			System.out.println("����� ������ "+nick+" �Դϴ�.");
//		} catch(FoolException e) {
//			System.err.println("FoolException�� �߻��߽��ϴ�.");
//		}
//		
//	}

	public void sayNick(String nick) {

		try {
			if(nick.equals("�ٺ�")) {
				throw new FoolException();
			}
			System.out.println("����� ������ "+nick+" �Դϴ�.");
		} catch(FoolException e) {
			System.err.println("FoolException�� �߻��߽��ϴ�.");
		}
		
	}

	public static void main(String[] args) {
		
		Program program = new Program();
		
			program.sayNick("�ٺ�");
			program.sayNick("��ȣ");
		
	}
	
}
