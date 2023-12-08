package chapter12.컬렉션프레임워크.collection.hashset;

import chapter12.컬렉션프레임워크.collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(101, "이순신");
		Member memberKim = new Member(102, "김유신");
		Member memberShin = new Member(103, "신사임당");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberShin);
		
		memberHashSet.showAll();
		System.out.println("------------------------");
		
		
		// Member Class 에 equals() 와 hashCode() 를 오버라이딩 함.
		// String, Integer 등 일부 참조변수는 equals()와 hashCode()가 이미 재정의 되어 있음
		// ------------------------------------------------------------------
		Member memberLee2 = new Member(101, "이몽룡");
		memberHashSet.addMember(memberLee2);
		
		memberHashSet.showAll();
		System.out.println("------------------------");
		
		

	}

}
