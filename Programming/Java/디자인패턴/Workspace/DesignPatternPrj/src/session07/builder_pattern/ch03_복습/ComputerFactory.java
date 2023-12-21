package session07.builder_pattern.ch03_����;

public class ComputerFactory {
	
	ComputerBluePrint computerBluePrint;

	public void setComputerBluePrint(ComputerBluePrint computerBluePrint) {

		this.computerBluePrint = computerBluePrint;
		
	}

	public void make() {
		computerBluePrint.setCpu();
		computerBluePrint.setRam();
		computerBluePrint.setStorage();
	}
	
	public Computer getComputer() {
		return computerBluePrint.getComputer();
	}

}
