package ex03.templatemethod.main;

import ex03.templatemethod.AbstGameConnectHelper;
import ex03.templatemethod.DefaultGameConnectHelper;

public class Main {

	public static void main(String[] args) {

		AbstGameConnectHelper helper = new DefaultGameConnectHelper();

		helper.requestConnection("���̵� ��ȣ �� ���� ����");
	}

}
