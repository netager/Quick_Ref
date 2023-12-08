package chapter12.컬렉션프레임워크.collection;

public class Member implements Comparable<Member> {

	private int memberId;
	private String memberName;
	
	public  Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	}


	@Override
	public int hashCode() {
		return memberId;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			
			if(this.memberId ==member.memberId) {
				return true;
			}
			else return false;
		}
		
		return false;
		
	}


	@Override
	public int compareTo(Member member) {

		boolean keyId = false;
		boolean ascending = false;
		
		if (keyId) {
			if(ascending) {
				return (this.memberId - member.memberId);   // 오름차순 : this.memberId - 추가할려는 member, member는 Tree에 구성되어 있는 객체
			      							        	    // 양수이면 오름차순, 음수이면 내림차순
			}
			else {
				return (this.memberId - member.memberId)*(-1);
				
			}
		}
		else {
			if(ascending) {
				return(this.memberName.compareTo(member.memberName));
			}
			else {
				return(this.memberName.compareTo(member.memberName))*(-1);
				
			}
		}
	}
	
	
		
}
