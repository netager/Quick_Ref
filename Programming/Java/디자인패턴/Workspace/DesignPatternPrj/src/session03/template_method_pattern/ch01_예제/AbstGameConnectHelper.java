package session03.template_method_pattern.ch01_����;

public abstract class AbstGameConnectHelper {

	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	
	// ���ø� �޼���
	public String requestConnection(String encodedInfo) {
		
		// �����۾� : ��ȣȭ�� ���ڿ��� ��ȣȭ
		String decodedInfo = doSecurity(encodedInfo);
		
		// ��������
		// ��ȯ�� ���� ������ ���̵�, ��ȣ�� �Ҵ��Ѵ�
		String id = "aaa";
		String password = "bbb";
		
		if(!authentication(id, password)) {
			throw new Error("���̵� ��ȣ ����ġ");
		}
		
		// ���� ����
		String userName = "userName";
		int i = authorization(userName);
		
		switch(i) {
		case -1:
			throw new Error("�˴ٿ�");
			
		case 0:
			System.out.println("���� �Ŵ���");
			break;
			
		case 1:
			System.out.println("���� ȸ��");
			break;
			
		case 2:
			System.out.println("���� ȸ��");
			break;

		case 3:
			System.out.println("���� ����");
			break;
			
		default:
			System.out.println("��Ÿ ��Ȳ");
			
		}
				
		return connection(decodedInfo);
	}

}
