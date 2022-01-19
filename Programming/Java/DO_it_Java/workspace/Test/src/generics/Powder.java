package generics;

public class Powder extends Material {

	@Override
	public String toString() {
		System.out.println("Powder의 toString()");
		return "재료는 Powder 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Power 재료로 출력합니다.");
		
	}
	
	

}
