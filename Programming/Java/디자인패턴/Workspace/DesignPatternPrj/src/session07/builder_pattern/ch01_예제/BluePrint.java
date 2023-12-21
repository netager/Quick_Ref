package session07.builder_pattern.ch01_����;

public abstract class BluePrint {

	abstract public void setCpu();
	abstract public void setRam();
	abstract public void setStorage();
	
	abstract public Computer getComputer();
}
