package session03.template_method_pattern.ch01_예제;

public class DefaultGameConnectionHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String string) {

//		System.out.println("디코드");
		System.out.println("강화된 알고리즘을 이용한 디코드");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {

		System.out.println("아이디/암호 확인 과정");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("권한 확인");
		// 서버에서 유저이름을 이용하여 나이를 알 수 있으며 나이를 확인하여 접속 제한
		return 0;	// 게임 매니저 접속으로 반환 
	}

	@Override
	protected String connection(String info) {

		System.out.println("마지막 접속단계!");
		return info;
	}
	

}
