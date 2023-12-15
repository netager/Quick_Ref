package ch01_decorate_pattern;

public abstract class Decorator extends Coffee {

	Coffee coffee;
	public Decorator(Coffee coffee) {
		
		this.coffee = coffee;
	}
	
	
	@Override
	public void brending() {

		coffee.brending();
		
	}

}
