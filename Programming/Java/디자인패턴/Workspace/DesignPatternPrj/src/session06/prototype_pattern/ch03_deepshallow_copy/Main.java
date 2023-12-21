package session06.prototype_pattern.ch03_deepshallow_copy;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2012,3));
		
		// 얕은 복사
		Cat shallowNavi = navi;
		shallowNavi.setName("shallowNavi");
		shallowNavi.setAge(new Age(2013, 2));
		
		System.out.println(" [얕은 복사] -----------------------------");
		System.out.println(navi.getName());
		System.out.println(navi.getAge().getYear());
		System.out.println(navi.getAge().getValue());
		System.out.println("----");
		System.out.println(shallowNavi.getName());
		System.out.println(shallowNavi.getAge().getYear());
		System.out.println(shallowNavi.getAge().getValue());
		System.out.println("-----------------------------");

		// 깊은 복사 - Cat class에 Cloneable implements 하고 copy 메서드 추가
		Cat deepNavi = navi.copy();
		deepNavi.setName("deepNavi");
		deepNavi.setAge(new Age(2010, 5));
		
		System.out.println(" [깊은 복사] -----------------------------");
		System.out.println(navi.getName());
		System.out.println(navi.getAge().getYear());
		System.out.println(navi.getAge().getValue());
		System.out.println("----");
		System.out.println(deepNavi.getName());
		System.out.println(deepNavi.getAge().getYear());
		System.out.println(deepNavi.getAge().getValue());
		System.out.println("-----------------------------");
		
		// 깊은 복사 주의 
		Cat deep1Navi = navi.copy();
		deep1Navi.setName("deepNavi");
		deep1Navi.getAge().setYear(2222);
		deep1Navi.getAge().setValue(100);

		System.out.println(" [깊은 복사1] -----------------------------");
		System.out.println(navi.getName());
		System.out.println(navi.getAge().getYear());
		System.out.println(navi.getAge().getValue());
		System.out.println("----");
		System.out.println(deep1Navi.getName());
		System.out.println(deep1Navi.getAge().getYear());
		System.out.println(deep1Navi.getAge().getValue());
		System.out.println("-----------------------------");
		
	}

}
