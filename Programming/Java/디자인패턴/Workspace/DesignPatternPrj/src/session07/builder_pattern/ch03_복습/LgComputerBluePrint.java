package session07.builder_pattern.ch03_º¹½À;

public class LgComputerBluePrint extends ComputerBluePrint {

	Computer computer;
	
	public LgComputerBluePrint() {
		computer = new Computer("default", "default", "default");

	}
	
	@Override
	public void setCpu() {
		computer.setCpu("i7");
		
	}

	@Override
	public void setRam() {
		computer.setRam("8g");
		
	}

	@Override
	public void setStorage() {
		computer.setStorage("256g ssd");
		
	}

	@Override
	public Computer getComputer() {
		return computer;
	}

}
