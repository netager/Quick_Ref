package ex03.templatemethod;

public class DefaultGameConnectHelper extends AbstGameConnectHelper{

	@Override
	protected String doSecurity(String string) {

		System.out.println("���ڵ�");
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
		
		// �������� �����̸� ������ ���̸� �� �� �ִ�.
		// ���̸� Ȯ���ϰ� �ð��� Ȯ���ϰ� ������ �ƴϰ� 22�ð� �����ٸ� ������ ���� ������ �Ѵ�
		

		return 0;
	}

	@Override
	protected String connection(String info) {

		System.out.println("������ ���Ӵܰ�!");
		return info;
	}

	
}
