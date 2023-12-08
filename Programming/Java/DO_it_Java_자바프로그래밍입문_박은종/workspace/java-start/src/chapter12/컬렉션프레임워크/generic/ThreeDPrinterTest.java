package chapter12.컬렉션프레임워크.generic;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		// Powder 재료
		ThreeDPrinter<Powder> printerPowder = new ThreeDPrinter<Powder>();
		
		printerPowder.setMaterial(new Powder());
		Powder powder = printerPowder.getMaterial();
		System.out.println(printerPowder);
		
		// Plastic 재료
		ThreeDPrinter<Plastic> printerPlastic = new ThreeDPrinter<Plastic>();
		
		printerPlastic.setMaterial(new Plastic());
		Plastic plastic = printerPlastic.getMaterial();
		System.out.println(printerPlastic);

		// Water 재료 ~ Material Class를 상속하지 않아서 오류 발생
//		ThreeDPrinter<Water> printerWater = new ThreeDPrinter<Water>();
//		
//		printerWater.setMaterial(new Water());
//		Water water = printerWater.getMaterial();
//		System.out.println(printerWater);
		
		printerPlastic.printing();
		

	}

}
