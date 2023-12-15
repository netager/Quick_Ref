package ex7.builder2;

public class Main {

	public static void main(String[] args) {
		
		ComputerFactory factory = new ComputerFactory();
		
		factory.setBlueprint(new LgGramBlueprint());
		
		factory.make();
		
		
		Computer computer = factory.getComputer();
		

		System.out.println(computer.toString());

	}

}
