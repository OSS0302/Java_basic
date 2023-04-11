package ch12;

public class MemberHashTest {

	public static void main(String[] args) {
		MemberHashList hashSet = new MemberHashList();
		
		Member memberLee = new Member(1001, "이지연" ,"서울특별시 서초구");
		Member memberKim = new Member(1002, "김태리","서울특별시 강남구");
		Member memberOh = new Member(1003,"오나라","서울 특별시영등포구 ");
		
		
		hashSet.addMember(memberLee);// 이지연 리스트에 넣기
		hashSet.addMember(memberKim);// 김태리 리스트에 넣기
		hashSet.addMember(memberOh); // 오나라 리스트에 넣기
		
		hashSet.showAllMember(); //보기
		
		Member memberHong =new Member(1003,"홍길동","경기도수원시 ");
		hashSet.addMember(memberHong);
		hashSet.showAllMember(); //보기

	}

}
