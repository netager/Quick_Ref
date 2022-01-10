package collection.arraylist;

import java.util.ArrayList;

import collection.Member;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
		
	}
	
	public boolean removeMember(int memberID) {
		
		/*for ( int i=0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempID = member.getMemberId();
			if( memberID == tempID) {
				arrayList.remove(i);
				return true;
			}
		}*/
		
		Iterator<Member> iterator = arrayList.iterator();
		while( iterator.hasNext() ) {
			Member member = iterator.next();
			
			int tempID = member.getMemberId();
			if( memberID == tempID) {
				arrayList.remove(member);
				return true;
			}

		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
		
	}

}
