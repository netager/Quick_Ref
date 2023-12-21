package session04.factory_method_pattern.ch01_����.concrete;

import java.util.Date;

import session04.factory_method_pattern.ch01_����.framwork.Item;
import session04.factory_method_pattern.ch01_����.framwork.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemInfo() {

		System.out.println("�����ͺ��̽����� ȸ�� ���� ������ ������ �����ɴϴ�.");
		
	}

	@Override
	protected void createItemLog() {
		System.out.println("ȸ�� ���� ������ ���� ���� �߽��ϴ�." + new Date());
		
	}

	@Override
	protected Item createItem() {
		return new HpPosion();
	}

}
