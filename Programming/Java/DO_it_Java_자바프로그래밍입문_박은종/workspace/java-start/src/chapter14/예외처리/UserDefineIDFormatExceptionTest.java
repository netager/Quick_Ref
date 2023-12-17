package chapter14.����ó��;

// ���� ���� ���̵��� ���� null �̰ų� 8�� ���� 20�� �̻��� ��� ���ܸ� �߻�
public class UserDefineIDFormatExceptionTest {

	private String userID;
	

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws UserDefineIDFormatException {
		if(userID == null) {
			throw new UserDefineIDFormatException("���̵�� null �� �� �����ϴ�.");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new UserDefineIDFormatException("���̵�� 8�� �̻� 20�� ���Ϸ� ������.");
		}
		this.userID = userID;
	}
	

	public static void main(String[] args) {
		
		UserDefineIDFormatExceptionTest idTest = new UserDefineIDFormatExceptionTest();
		
		String userID = null;
		try {
			idTest.setUserID(userID);
		} catch (UserDefineIDFormatException e) {
		System.out.println(e);
		}
		
		
		userID = "1234567";
		try {
			idTest.setUserID(userID);
		} catch (UserDefineIDFormatException e) {
		System.out.println(e.getMessage());
		}
	}
}