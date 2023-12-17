<<<<<<<< HEAD:Programming/Java/디자인패턴/Workspace/DesignPrj/src/ex7/builder1/BluePrint.java
package ex7.builder1;
========
package ex07.builder;
>>>>>>>> f8342e4517bb6fb91991f229765f80f969d5229a:Programming/Java/디자인패턴/Workspace/DesignPrj/src/ex07/builder/BluePrint.java

public abstract class BluePrint {
	
	abstract public void setCpu();
	abstract public void setRam();
	abstract public void setStorage();
	
	abstract public Computer getComputer();
	
}
