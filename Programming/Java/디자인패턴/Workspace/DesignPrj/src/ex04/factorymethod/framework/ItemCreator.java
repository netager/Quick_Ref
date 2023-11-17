package ex04.factorymethod.framework;

public abstract class ItemCreator {
	
	// ���丮 �޼ҵ� -> ���ø� �޼ҵ�ó�� ����
	public Item create() {
		
		Item item;
		
		// stemp1
		requestItemsInfo();
		
		// step2
		item = createItem();
		
		// step3
		createItemLog();
		
		return item;
		
	}
	
	// �������� �����ϱ� ���� �����ͺ��̽����� ������ ������ ��û�մϴ�.
	abstract protected void requestItemsInfo();
	
	// �������� ���� �� ������ ���� ���� �ҹ��� �����ϱ� ���� �����ͺ��̽��� ������ ����
	abstract protected void createItemLog();
	
	// �������� �����ϴ� �˰���
	abstract protected Item createItem();

}
