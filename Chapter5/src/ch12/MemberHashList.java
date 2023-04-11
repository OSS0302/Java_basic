package ch12;


import java.util.HashSet;
import java.util.Iterator;

public class MemberHashList {
	private HashSet<Member>hashSet; //ArrayList선언
	
	public MemberHashList(){
		hashSet = new HashSet<Member>();  //멤버로 선언한 ArrayList 생성
	}
	public void addMember(Member member){  //ArrayList 에 멤버 추가
		hashSet.add(member);
	}
public boolean removeMember(int memberId){  // 멤버 아이디를 매개변수로, 삭제 여부를 반환
		
	Iterator<Member> ir = hashSet.iterator();
	while(ir.hasNext()) {					// 트루일때까지 반복해서 꺼내
		Member member = ir.next();			// 꺼내서 member에 넣어라.
		int tempId = member.getMemberId();
		if(tempId == memberId){            // 멤버아이디가 매개변수와 일치하면 
			hashSet.remove(member);           // 해당 멤버를 삭제
			return true;                   // true 반환
		}
	}
	
	System.out.println(memberId + "가 존재하지 않습니다");  //for 가 끝날때 까지 return 이 안된경우
	return false;                   
}

	
	public void showAllMember(){
		for(Member member : hashSet){
			System.out.println(member);
		}
		System.out.println();
	}
}



