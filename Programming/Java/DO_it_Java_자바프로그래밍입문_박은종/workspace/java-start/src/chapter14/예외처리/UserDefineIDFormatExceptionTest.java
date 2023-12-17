package chapter14.예외처리;

// 전달 받은 아이디의 값이 null 이거나 8자 이하 20자 이상인 경우 예외를 발생
public class UserDefineIDFormatExceptionTest {

	private String userID;
	

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws UserDefineIDFormatException {
		if(userID == null) {
			throw new UserDefineIDFormatException("아이디는 null 일 수 없습니다.");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new UserDefineIDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
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