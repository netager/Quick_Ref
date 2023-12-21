package session04.factory_method_pattern.ch01_����.framwork;

public abstract class ItemCreator {
	
	// Template Method Pattern ����
	public Item create() {
		Item item;
		
		// Step1
		requestItemInfo();
		
		// Step2
		item = createItem();
		
		// Step3
		createItemLog();
		
		return item;
	}
	
	// �������� �����ϱ� ���� �����ͺ��̽����� ������ ������ ��û�մϴ�.
	abstract protected void requestItemInfo();
	
	// �������� ���� �� ������ �������� ������ ���� �����ͺ��̽��� ������ ���������� ����
	abstract protected void createItemLog();
	
	// �������� �����ϴ� �˰���
	abstract protected Item createItem();
}
