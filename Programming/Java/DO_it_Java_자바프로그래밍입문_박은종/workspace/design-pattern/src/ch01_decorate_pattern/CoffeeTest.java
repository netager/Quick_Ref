package ch01_decorate_pattern;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee coffee = new Americano();
		coffee.brending();
		System.out.println();
		System.out.println("-----------------------------------");
		
		Coffee latteCoffee = new Latte(coffee);
		latteCoffee.brending();
		System.out.println();
		System.out.println("-----------------------------------");
		
		Coffee mochaCoffee = new Mocha(latteCoffee);
		mochaCoffee.brending();
		System.out.println();
		System.out.println("-----------------------------------");

		Coffee whippedCreamCoffee1 = new WhippedCream(mochaCoffee);
		whippedCreamCoffee1.brending();
		System.out.println();
		System.out.println("-----------------------------------");

		Coffee whippedCreamCoffee2 = new WhippedCream(new Mocha(new Latte(new Americano())));
		whippedCreamCoffee2.brending();
		System.out.println();
		System.out.println("-----------------------------------");

		Coffee myCoffee = new Mocha(new Americano());
		myCoffee.brending();
		System.out.println();
		System.out.println("-----------------------------------");

	}

}
