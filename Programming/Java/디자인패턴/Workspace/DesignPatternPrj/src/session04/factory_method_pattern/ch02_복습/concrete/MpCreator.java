package session04.factory_method_pattern.ch02_����.concrete;

import java.util.Date;

import session04.factory_method_pattern.ch02_����.framework.Item;
import session04.factory_method_pattern.ch02_����.framework.ItemCreator;

public class MpCreator extends ItemCreator {

	@Override
	protected void requestItemInfo() {

		System.out.println("����ȸ�� ���� ������ ��û�մϴ�." + new Date());
		
	}

	@Override
	protected void createItemLog() {
		
		System.out.println("����ȸ�� ���� ���� ������ �����մϴ�." + new Date());
		
	}

	@Override
	protected Item createItem() {
		return new MpPosion();
	}

}
