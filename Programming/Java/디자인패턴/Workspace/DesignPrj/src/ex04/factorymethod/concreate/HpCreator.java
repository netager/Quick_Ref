package ex04.factorymethod.concreate;

import java.util.Date;

import ex04.factorymethod.framework.Item;
import ex04.factorymethod.framework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		
		System.out.println("�����ͺ��̽����� ü��ȸ�� ������ ������ �����ɴϴ�.");
		
	}

	@Override
	protected void createItemLog() {

		System.out.println("ü�� ȸ�� ������ ���� �����߽��ϴ� " + new Date());
	}

	@Override
	protected Item createItem() {

		return new HpPotion();
	}

}
