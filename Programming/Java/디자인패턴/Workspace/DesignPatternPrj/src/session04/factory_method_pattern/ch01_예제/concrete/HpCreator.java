package session04.factory_method_pattern.ch01_예제.concrete;

import java.util.Date;

import session04.factory_method_pattern.ch01_예제.framwork.Item;
import session04.factory_method_pattern.ch01_예제.framwork.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemInfo() {

		System.out.println("데이터베이스에서 회복 마력 물약의 정보를 가져옵니다.");
		
	}

	@Override
	protected void createItemLog() {
		System.out.println("회복 마력 물약을 새로 생성 했습니다." + new Date());
		
	}

	@Override
	protected Item createItem() {
		return new HpPosion();
	}

}
