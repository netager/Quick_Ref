package chapter12.�÷��������ӿ�ũ.generic;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		// Powder ���
		ThreeDPrinter<Powder> printerPowder = new ThreeDPrinter<Powder>();
		
		printerPowder.setMaterial(new Powder());
		Powder powder = printerPowder.getMaterial();
		System.out.println(printerPowder);
		
		// Plastic ���
		ThreeDPrinter<Plastic> printerPlastic = new ThreeDPrinter<Plastic>();
		
		printerPlastic.setMaterial(new Plastic());
		Plastic plastic = printerPlastic.getMaterial();
		System.out.println(printerPlastic);

		// Water ��� ~ Material Class�� ������� �ʾƼ� ���� �߻�
//		ThreeDPrinter<Water> printerWater = new ThreeDPrinter<Water>();
//		
//		printerWater.setMaterial(new Water());
//		Water water = printerWater.getMaterial();
//		System.out.println(printerWater);
		
		printerPlastic.printing();
		

	}

}
