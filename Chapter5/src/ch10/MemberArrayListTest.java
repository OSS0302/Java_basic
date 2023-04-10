package ch10;

public class MemberArrayListTest {

	public static void main(String[] args) {
MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee_g = new Member(1001, "이경영" ,"서울특별시 동작");
		Member memberKim = new Member(1002, "김우빈","서울특별시 강남구");
		Member memberOh = new Member(1003,"오달수","서울 특별시영등포구 ");
		Member memberLee_B = new Member(1004,"이병헌","경기도 광주시  ");
		
		memberArrayList.addMember(memberLee_g);// 이경영 리스트에 넣기
		memberArrayList.addMember(memberKim);// 김우빈 리스트에 넣기
		memberArrayList.addMember(memberOh); //오달수 리스트에 넣기
		memberArrayList.addMember(memberLee_B); // 이병헌 리스트에 넣기
	
		
		memberArrayList.showAllMember(); //보기
		
		//삭제 하기 
		memberArrayList.removeMember(memberLee_g.getMemberId());
		
		memberArrayList.showAllMember(); //보기

	}

}
