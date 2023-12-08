package chapter12.컬렉션프레임워크.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import chapter12.컬렉션프레임워크.collection.Member;

public class MemberHashSet {

	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		// Iterator 처리를 위해 주석 처리
//		for(int i=0; i<arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			if(memberId == member.getMemberId()) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
		
		// Iterator 처리
		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();

			if(memberId == member.getMemberId()) {
				hashSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
		
	public void showAll() {
		
		// Iterator 처리를 위해 주석 처리
//		for(Member member : arrayList) {
//			System.out.println(member);
//		}
		
		Iterator<Member> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			Member member = iterator.next();
			System.out.println(member);
		}
		
//		System.out.println(arrayList);
	}

	
}
