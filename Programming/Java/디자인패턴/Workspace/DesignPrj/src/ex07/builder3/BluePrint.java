package ex07.builder3;

public abstract class BluePrint {
	
	abstract public void setCpu();
	abstract public void setRam();
	abstract public void setStorage();
	
	abstract public Computer getComputer();
	
}
