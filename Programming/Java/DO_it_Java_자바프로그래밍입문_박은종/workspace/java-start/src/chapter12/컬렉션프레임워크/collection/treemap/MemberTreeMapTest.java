package chapter12.�÷��������ӿ�ũ.collection.treemap;

import chapter12.�÷��������ӿ�ũ.collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memberLee = new Member(101, "�̼���");
		Member memberKim = new Member(102, "������");
		Member memberShin = new Member(103, "�Ż��Ӵ�");
		
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberShin);
		
		memberTreeMap.showAllMember();
		System.out.println("----------------------------------");
		
		memberTreeMap.removeMember(103);
		
		memberTreeMap.showAllMember();
		
		
		

	}

}
