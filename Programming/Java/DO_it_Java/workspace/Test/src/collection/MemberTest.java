package collection;

import java.util.ArrayList;

public class MemberTest {

	public static void main(String[] args) {
		
		
		ArrayList<Member> member = new ArrayList<Member>();
		member.add(new Member(111, "LeeSoonCheon"));
		member.add(new Member(112, "KimYuShine"));
		
		for (Member mem : member) {
			System.out.println(mem);			
		}


//		Member member = new Member(123, "Lee");
//		System.out.println(member);
	}

}
