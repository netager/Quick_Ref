package chapter12.�÷��������ӿ�ũ.collection.arraylist;

import chapter12.�÷��������ӿ�ũ.collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(101, "�̼���");
		Member memberKim = new Member(102, "������");
		Member memberShin = new Member(103, "�Ż��Ӵ�");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberShin);

		memberArrayList.showAll();
		System.out.println("--------------------------");
		
		memberArrayList.removeMember(memberKim.getMemberId());
		memberArrayList.showAll();
	}

}
