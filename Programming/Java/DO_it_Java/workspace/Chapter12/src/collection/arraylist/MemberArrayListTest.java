package collection.arraylist;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member MemberLee = new Member(101, "�̼�õ");
		Member MemberKim = new Member(102, "������");
		Member MemberShin = new Member(103, "�Ż��Ӵ�");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberShin);
		
		memberArrayList.showAll();
		
		
	}

}
