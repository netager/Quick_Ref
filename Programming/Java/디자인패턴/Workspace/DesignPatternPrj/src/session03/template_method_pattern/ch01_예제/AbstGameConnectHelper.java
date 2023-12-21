package session03.template_method_pattern.ch01_예제;

public abstract class AbstGameConnectHelper {

	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	
	// 템플릿 메서드
	public String requestConnection(String encodedInfo) {
		
		// 보안작업 : 암호화된 문자열을 복호화
		String decodedInfo = doSecurity(encodedInfo);
		
		// 인증과정
		// 반환된 것을 가지고 아이디, 암호를 할당한다
		String id = "aaa";
		String password = "bbb";
		
		if(!authentication(id, password)) {
			throw new Error("아이디 암호 불일치");
		}
		
		// 권한 과정
		String userName = "userName";
		int i = authorization(userName);
		
		switch(i) {
		case -1:
			throw new Error("셧다운");
			
		case 0:
			System.out.println("게임 매니저");
			break;
			
		case 1:
			System.out.println("유료 회원");
			break;
			
		case 2:
			System.out.println("무료 회원");
			break;

		case 3:
			System.out.println("권한 없음");
			break;
			
		default:
			System.out.println("기타 상황");
			
		}
				
		return connection(decodedInfo);
	}

}
