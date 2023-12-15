package ex7.builder2;

public class LgGramBlueprint extends BluePrint {

	private Computer computer;
	
	
	public LgGramBlueprint() {

		computer = new Computer("defalut", "default", "default");
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
		// TODO Auto-generated method stub
		return computer;
	}
	
	
	
	

}
