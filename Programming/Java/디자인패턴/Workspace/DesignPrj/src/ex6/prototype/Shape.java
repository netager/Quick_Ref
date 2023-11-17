package ex6.prototype;

public class Shape implements Cloneable {
	
	private String id;
	
	
	public void setId(String id) {
		this.id = id;
	}

	
	public String getId() {
		return id;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
