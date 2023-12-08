package chapter12.컬렉션프레임워크.generic;

public class ThreeDPrinter<T extends Material> {
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
		
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
	
	
	

}
