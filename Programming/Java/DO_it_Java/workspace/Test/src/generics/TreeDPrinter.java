package generics;

public class TreeDPrinter<T extends Material> {
	
	private T material;

	public T getMaterial() {
		return material;
	}


	public void setMaterial(T material) {
		this.material = material;
		
	}

	@Override
	public String toString() {
		System.out.println("TreeDPrinter<T> toString()");
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
	
	
	

}
