package session07.builder_pattern.ch02_º¹½À;

public class Main {

	public static void main(String[] args) {
		
		ComputerFactory factory = new ComputerFactory();
		Computer computer;
		
		factory.setComputerBluePrint(new LgGramBluePrint());
		factory.make();
		computer = factory.getComputer();
		
		System.out.println(computer);
		System.out.println("----------------------------");

		factory.setComputerBluePrint(new MacBluePrint());
		factory.make();
		computer = factory.getComputer();
		
		System.out.println(computer);

	}

}
