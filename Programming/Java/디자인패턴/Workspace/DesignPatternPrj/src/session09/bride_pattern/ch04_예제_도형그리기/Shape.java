package session09.bride_pattern.ch04_예제_도형그리기;

public abstract class Shape {
	
	protected DrawAPI drawAPI;
	
	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();

}
