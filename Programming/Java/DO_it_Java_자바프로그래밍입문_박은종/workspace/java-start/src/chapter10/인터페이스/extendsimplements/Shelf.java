package chapter10.인터페이스.extendsimplements;

import java.util.ArrayList;

public class Shelf {
	
	protected ArrayList<String> shelf;

	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
		
	}
}
