package chapter14.����ó��;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		try(AutoCloseObj obj = new AutoCloseObj()) {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("exception");
		}
		
		// Java9 ���� �����ϴ� ��� ����
//		AutoCloseObj obj1 = new AutoCloseObj();
//
//		try(obj) {
//			throw new Exception();
//		} catch(Exception e) {
//			System.out.println("exception");
//		}
		
	}

}
