package ch01_decorate_pattern;

public class Latte extends Decorator {

	public Latte(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void brending() {
		super.brending();
		System.out.print("Adding Milk ");
	}
	
}
