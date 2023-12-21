package session09.bride_pattern.ch04_����_�����׸���;

public abstract class Shape {
	
	protected DrawAPI drawAPI;
	
	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();

}
