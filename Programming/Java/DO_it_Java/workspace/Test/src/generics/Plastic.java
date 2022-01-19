package generics;

public class Plastic extends Material {
	
	@Override
	public String toString() {
		System.out.println("Plastic의 toString()");
		return "재료는 Plastic 입니다.";
	}

	@Override
	public void doPrinting() {
	
		System.out.println("Power 재료로 출력합니다.");
		
	}
	
}
