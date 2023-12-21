package session04.factory_method_pattern.ch02_복습.concrete;

import java.util.Date;

import session04.factory_method_pattern.ch02_복습.framework.Item;
import session04.factory_method_pattern.ch02_복습.framework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemInfo() {

		System.out.println("체력회복물약 정보를 요청합니다." + new Date());
		
	}

	@Override
	protected void createItemLog() {
		
		System.out.println("체력회복물약 생성 정보를 저장합니다."+ new Date());
		
	}

	@Override
	protected Item createItem() {
		return new HpPosion();
	}

}
