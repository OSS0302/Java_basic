package ch13;

public class Member implements Comparable<Member> {
	private int memberId; // 회원 아이디 
	private String memberName; //회원 이름
	private String address; // 회원 주소

	public Member(int memberId, String memberName, String address) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {  //toString 메소드 오버로딩
		return memberName +"회원아이디는"+memberId +"이고 주소는"+address+"입니다.";
		
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj; // 멤버로 형변환을 해준다.
			return true;
	}
		else return false;
		}
	

	@Override
	public int compareTo(Member member) { // 콜백 function
		if(this.memberId> member.memberId)
		return 1;
		else if(this.memberId <memberId)
			return-1;
		else return 0;
	}
}
