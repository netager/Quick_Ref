package chapter14.예외처리;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		try(AutoCloseObj obj = new AutoCloseObj()) {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("exception");
		}
		
		// Java9 부터 제공하는 기능 구현
//		AutoCloseObj obj1 = new AutoCloseObj();
//
//		try(obj) {
//			throw new Exception();
//		} catch(Exception e) {
//			System.out.println("exception");
//		}
		
	}

}
