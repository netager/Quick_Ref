package session04.factory_method_pattern.ch02_º¹½À.framework;

public abstract class ItemCreator {
	
	public Item create() {
		requestItemInfo();
		Item item = createItem();
		createItemLog();
		
		return item;
	}
	
	abstract protected void requestItemInfo();
	abstract protected void createItemLog();
	abstract protected Item createItem();
	
	

}
