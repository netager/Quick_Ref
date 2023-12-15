package chapter12.�÷��������ӿ�ũ.collection.hashset;

import chapter12.�÷��������ӿ�ũ.collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(101, "�̼���");
		Member memberKim = new Member(102, "������");
		Member memberShin = new Member(103, "�Ż��Ӵ�");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberShin);
		
		memberHashSet.showAll();
		System.out.println("------------------------");
		
		
		// Member Class �� equals() �� hashCode() �� �������̵� ��.
		// String, Integer �� �Ϻ� ���������� equals()�� hashCode()�� �̹� ������ �Ǿ� ����
		// ------------------------------------------------------------------
		Member memberLee2 = new Member(101, "�̸���");
		memberHashSet.addMember(memberLee2);
		
		memberHashSet.showAll();
		System.out.println("------------------------");
		
		

	}

}
