package session04.factory_method_pattern.ch01_예제.framwork;

public abstract class ItemCreator {
	
	// Template Method Pattern 적용
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
	
	// 아이템을 생성하기 전에 데이터베이스에서 아이템 정보를 요청합니다.
	abstract protected void requestItemInfo();
	
	// 아이템을 생성 후 아이템 복제등의 방지를 위해 데이터베이스에 아이템 생성정보를 남김
	abstract protected void createItemLog();
	
	// 아이템을 생성하는 알고리즘
	abstract protected Item createItem();
}
