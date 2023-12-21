package session07.builder_pattern.ch03_º¹½À;

public class MacComputerBluePrint extends ComputerBluePrint {

	Computer computer;
	
	public MacComputerBluePrint() {
		computer = new Computer("default", "default", "default");

	}
	
	@Override
	public void setCpu() {
		computer.setCpu("m1");
		
	}

	@Override
	public void setRam() {
		computer.setRam("16g");
		
	}

	@Override
	public void setStorage() {
		computer.setStorage("512g ssd");
		
	}

	@Override
	public Computer getComputer() {
		return computer;
	}

}
