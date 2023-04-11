package ch13;

import java.util.Comparator;

public class Member implements Comparator<Member> {
	private int memberId; // 회원 아이디 
	private String memberName; //회원 이름
	private String address; // 회원 주소
	
	// 기본 생성자 추가하기
	public Member() {}

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
	// 
//	@Override  //treeSet 오름차순과 내림차순을  구현할 수있다.. 
//	public int compareTo(Member member) { // 콜백 function
//		//return (this.memberId - member.memberId); // 오름차순 
//		return (this.memberId - member.memberId)* (-1); // 내림차순 
//	}

	@Override
	public int compare(Member member1, Member member2) {
		//return (member1.memberId - member2.memberId) ; //오름차순인경우
		// return (member2.memberId - member1.memberId) ; //내림차순인경우
		return (member1.memberId - member2.memberId)*(-1) ; //내림차순인경우
	}
	
}
