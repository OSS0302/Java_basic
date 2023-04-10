package ch11;

public class MemberArrayListTest {

	public static void main(String[] args) {
MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "이경영" ,"서울특별시 동작");
		Member memberKim = new Member(1002, "김우빈","서울특별시 강남구");
		Member memberOh = new Member(1003,"오달수","서울 특별시영등포구 ");
		
		
		memberArrayList.addMember(memberLee);// 이경영 리스트에 넣기
		memberArrayList.addMember(memberKim);// 김우빈 리스트에 넣기
		memberArrayList.addMember(memberOh);
		
		memberArrayList.showAllMember(); //보기
		
		memberArrayList.removeMember(1002);
		
		memberArrayList.showAllMember(); //보기

	}

}
