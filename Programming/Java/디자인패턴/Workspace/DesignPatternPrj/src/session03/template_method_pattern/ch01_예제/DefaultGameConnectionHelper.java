package session03.template_method_pattern.ch01_����;

public class DefaultGameConnectionHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String string) {

//		System.out.println("���ڵ�");
		System.out.println("��ȭ�� �˰����� �̿��� ���ڵ�");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {

		System.out.println("���̵�/��ȣ Ȯ�� ����");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("���� Ȯ��");
		// �������� �����̸��� �̿��Ͽ� ���̸� �� �� ������ ���̸� Ȯ���Ͽ� ���� ����
		return 0;	// ���� �Ŵ��� �������� ��ȯ 
	}

	@Override
	protected String connection(String info) {

		System.out.println("������ ���Ӵܰ�!");
		return info;
	}
	

}
