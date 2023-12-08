package chapter12.컬렉션프레임워크.collection.treeset;

import chapter12.컬렉션프레임워크.collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberLee = new Member(102, "이순신");
		Member memberKim = new Member(101, "김유신");
		Member memberShin = new Member(103, "신사임당");
		
		
		// Member에 implements Comparable<Member> 와 compareTo() 구현해야
		// TreeSet Class 의 정렬 기능을 사용할 수 있음.
		// ----------------------------------------------------------
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberShin);
		
		memberTreeSet.showAll();
		
		

	}

}
