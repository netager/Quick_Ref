package generics;

public class TreeDPrinterTest {

	public static void main(String[] args) {

		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>();
		printer.setMaterial(new Powder());
		Powder powder = printer.getMaterial();
		System.out.println(powder);
		System.out.println(printer);
		System.out.println("------------------------------------------------");
		powder.doPrinting();
		printer.printing();
		System.out.println("------------------------------------------------");
		
		TreeDPrinter<Plastic> printerPlastic = new TreeDPrinter<Plastic>();
		printerPlastic.setMaterial(new Plastic());
		Plastic plastic = printerPlastic.getMaterial();
		System.out.println(plastic);
		System.out.println(printerPlastic);
		System.out.println("------------------------------------------------");
		plastic.doPrinting();
		printerPlastic.printing();
		System.out.println("------------------------------------------------");
		
//		TreeDPrinter<Water> printerWater = new TreeDPrinter<Water>();
//		printerWater.setMaterial(new Water());
//		Water water = printerWater.getMaterial();
//		System.out.println(printerWater);
//		System.out.println("------------------------------------------------");

	}

}
