package collection.treeset;

import java.util.HashSet;
import java.util.Iterator;
import collection.Member;

public class MemberTreeSet{
	
	private HashSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
		
		Iterator<Member> iterator = treeSet.iterator();
		while( iterator.hasNext() ) {
			Member member = iterator.next();
			
			int tempID = member.getMemberId();
			if( memberID == tempID) {
				treeSet.remove(member);
				return true;
			}

		}
		
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
		
	}
	
	public void showAll() {
		for( Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
