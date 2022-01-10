package collection.arraylist;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member MemberLee = new Member(101, "이순천");
		Member MemberKim = new Member(102, "김유신");
		Member MemberShin = new Member(103, "신사임당");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberShin);
		
		memberArrayList.showAll();
		
		
	}

}
