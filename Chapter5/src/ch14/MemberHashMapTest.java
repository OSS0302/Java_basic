package ch14;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(1001, "이지연" ,"서울특별시 서초구");
		Member memberKim = new Member(1002, "김태리","서울특별시 강남구");
		Member memberOh = new Member(1003,"오나라","서울 특별시영등포구 ");
		
		
		memberHashMap.addMember(memberLee);// 이지연 리스트에 넣기
		memberHashMap.addMember(memberKim);// 김태리 리스트에 넣기
		memberHashMap.addMember(memberOh); // 오나라 리스트에 넣기
		
		memberHashMap.showAllMember(); //보기 출력할 때 member와 해쉬맵을 둘다 출력했다.
		
		
		
	}

}
