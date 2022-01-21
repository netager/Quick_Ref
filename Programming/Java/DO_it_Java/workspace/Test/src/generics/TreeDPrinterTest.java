package generics;

public class TreeDPrinterTest {

	public static void main(String[] args) {

		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>();
		printer.setMaterial(new Powder());
		Powder powder = printer.getMaterial();
		System.out.println(printer);
		
		
		TreeDPrinter<Plastic> printer1 = new TreeDPrinter<Plastic>();
		printer1.setMaterial(new Plastic());
		Plastic plastic = printer1.getMaterial();
		System.out.println(plastic);
		
//		TreeDPrinter<Water> printer2 = new TreeDPrinter<Water>();
//		printer2.setMaterial(new Water());
//		Water water = printer2.getMaterial();
//		System.out.println(water);
		
		printer1.printing();
		
		
	}

}
