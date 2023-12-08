package chapter10.인터페이스.extendsimplements;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {

		shelf.add(title);
		
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}

	
}
