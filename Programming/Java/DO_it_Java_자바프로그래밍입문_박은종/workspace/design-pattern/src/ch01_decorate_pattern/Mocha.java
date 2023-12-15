package ch01_decorate_pattern;

public class Mocha extends Decorator {

	public Mocha(Coffee coffee) {
		super(coffee);

	}
	
	@Override
	public void brending() {
		super.brending();
		System.out.print("Adding Mocha syrup ");
	}


}
