package session03.template_method_pattern.ch01_����.Main;

import session03.template_method_pattern.ch01_����.AbstGameConnectHelper;
import session03.template_method_pattern.ch01_����.DefaultGameConnectionHelper;

public class Main {

	public static void main(String[] args) {

		AbstGameConnectHelper helper = new DefaultGameConnectionHelper();
		
		helper.requestConnection("���̵� ��ȣ �� ���� ����");
	}

}
