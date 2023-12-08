package ch01_decorate_pattern;

public class WhippedCream extends Decorator {

	public WhippedCream(Coffee coffee) {
		super(coffee);

	}

	@Override
	public void brending() {
		super.brending();
		System.out.print("Adding Whipping Cream ");
	}
	
}
