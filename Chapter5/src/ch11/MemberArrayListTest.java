package ch11;

public class MemberArrayListTest {

	public static void main(String[] args) {
MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "이지연" ,"서울특별시 서초구");
		Member memberKim = new Member(1002, "김태리","서울특별시 강남구");
		Member memberOh = new Member(1003,"오나라","서울 특별시영등포구 ");
		
		
		memberArrayList.addMember(memberLee);// 이지연 리스트에 넣기
		memberArrayList.addMember(memberKim);// 김태리 리스트에 넣기
		memberArrayList.addMember(memberOh); // 오나라 리스트에 넣기
		
		memberArrayList.showAllMember(); //보기
		
		memberArrayList.removeMember(memberOh.getMemberId()); // 삭제하
		
		memberArrayList.showAllMember(); //보기

	}

}
