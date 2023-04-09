package ch10;

public class MemberArrayListTest {

	public static void main(String[] args) {
MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "이순신" ,"경기도 평택시");
		
		memberArrayList.addMember(memberLee);// 이순신 리스트에 넣기
		
		memberArrayList.showAllMember(); //보

	}

}
