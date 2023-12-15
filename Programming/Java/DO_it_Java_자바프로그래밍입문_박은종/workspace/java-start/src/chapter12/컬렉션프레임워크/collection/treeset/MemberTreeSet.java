package chapter12.�÷��������ӿ�ũ.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import chapter12.�÷��������ӿ�ũ.collection.Member;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();

			if(memberId == member.getMemberId()) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
		
	public void showAll() {
		Iterator<Member> iterator = treeSet.iterator();
		
		while(iterator.hasNext()) {
			Member member = iterator.next();
			System.out.println(member);
		}
		
	}

	
}
