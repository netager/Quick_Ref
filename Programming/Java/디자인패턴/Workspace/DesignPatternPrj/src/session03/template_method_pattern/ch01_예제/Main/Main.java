package session03.template_method_pattern.ch01_예제.Main;

import session03.template_method_pattern.ch01_예제.AbstGameConnectHelper;
import session03.template_method_pattern.ch01_예제.DefaultGameConnectionHelper;

public class Main {

	public static void main(String[] args) {

		AbstGameConnectHelper helper = new DefaultGameConnectionHelper();
		
		helper.requestConnection("아이디 암호 등 접속 정보");
	}

}
