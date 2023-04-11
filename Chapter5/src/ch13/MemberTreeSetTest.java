package ch13;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSetList TreeSet = new MemberTreeSetList();
		
		Member memberLee = new Member(1001, "이지연" ,"서울특별시 서초구");
		Member memberKim = new Member(1002, "김태리","서울특별시 강남구");
		Member memberOh = new Member(1003,"오나라","서울 특별시영등포구 ");
		
		
		TreeSet.addMember(memberLee);// 이지연 리스트에 넣기
		TreeSet.addMember(memberKim);// 김태리 리스트에 넣기
		TreeSet.addMember(memberOh); // 오나라 리스트에 넣기
		
		TreeSet.showAllMember(); //보기
		
		Member memberHong =new Member(1003,"홍길동","경기도수원시 "); // 1003 중복 회원 생성 
		TreeSet.addMember(memberHong); // 중복회원 추가하기
		TreeSet.showAllMember(); //보기

	}

}
