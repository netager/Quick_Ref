package chapter12.�÷��������ӿ�ũ.collection.treeset;

import chapter12.�÷��������ӿ�ũ.collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberLee = new Member(102, "�̼���");
		Member memberKim = new Member(101, "������");
		Member memberShin = new Member(103, "�Ż��Ӵ�");
		
		
		// Member�� implements Comparable<Member> �� compareTo() �����ؾ�
		// TreeSet Class �� ���� ����� ����� �� ����.
		// ----------------------------------------------------------
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberShin);
		
		memberTreeSet.showAll();
		
		

	}

}
