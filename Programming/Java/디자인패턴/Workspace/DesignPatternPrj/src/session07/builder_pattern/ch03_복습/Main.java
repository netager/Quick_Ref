package session07.builder_pattern.ch03_º¹½À;

public class Main {

	public static void main(String[] args) {

		ComputerFactory factory = new ComputerFactory();
		Computer computer;
		
		factory.setComputerBluePrint(new LgComputerBluePrint());
		factory.make();
		computer = factory.getComputer();
		System.out.println(computer);
		System.out.println("---------------");
		
		factory.setComputerBluePrint(new MacComputerBluePrint());
		factory.make();
		computer = factory.getComputer();
		System.out.println(computer);

	}

}
