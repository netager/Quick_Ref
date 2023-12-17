package chapter12.컬렉션프레임워크.collection.hashmap;

import chapter12.컬렉션프레임워크.collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(101, "이순신");
		Member memberKim = new Member(102, "김유신");
		Member memberShin = new Member(103, "신사임당");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberShin);
		
		memberHashMap.showAllMember();
		System.out.println("----------------------------------");
		
		memberHashMap.removeMember(103);
		
		memberHashMap.showAllMember();
		
		
		

	}

}
