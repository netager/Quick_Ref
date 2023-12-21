package session07.builder_pattern.ch01_¿¹Á¦;

public class Main {

	public static void main(String[] args) {

		ComputerFactory factory = new ComputerFactory();
		factory.setBlueprint(new LgGramBlueprint());
		
		factory.make();
		Computer computer = factory.getComputer();
		
		System.out.println(computer);

	}

}
