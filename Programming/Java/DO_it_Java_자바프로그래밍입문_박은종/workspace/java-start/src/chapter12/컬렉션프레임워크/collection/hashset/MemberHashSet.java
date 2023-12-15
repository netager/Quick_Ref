package chapter12.�÷��������ӿ�ũ.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import chapter12.�÷��������ӿ�ũ.collection.Member;

public class MemberHashSet {

	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		// Iterator ó���� ���� �ּ� ó��
//		for(int i=0; i<arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			if(memberId == member.getMemberId()) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
		
		// Iterator ó��
		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();

			if(memberId == member.getMemberId()) {
				hashSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
		
	public void showAll() {
		
		// Iterator ó���� ���� �ּ� ó��
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
