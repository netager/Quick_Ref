package ex04.factorymethod.concreate;

import java.util.Date;

import ex04.factorymethod.framework.Item;
import ex04.factorymethod.framework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		
		System.out.println("데이터베이스에서 체력회복 물약의 정보를 가져옵니다.");
		
	}

	@Override
	protected void createItemLog() {

		System.out.println("체력 회복 물약을 새로 생성했습니다 " + new Date());
	}

	@Override
	protected Item createItem() {

		return new HpPotion();
	}

}
