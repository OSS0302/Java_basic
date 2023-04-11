package ch14;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	
	private HashMap<Integer,Member> hashMap; // Integer,Member로 이루어져있 keySet 으로 호출하면 IntegerSet 으로 반환 한다. value로 호출하면 Member로 호출된다.
	// put: 집어넣을떼 put이고   get꺼낼때 get이다. containsKey(Object key) 키가 있는지 없는지 boolean으로  가르쳐준다. containsKey(Object value) 값이 boolean 으로 있는지 없는지 가르쳐준다.
	public MemberHashMap()
	{
		hashMap = new HashMap<Integer, Member>();
	}

	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
		 
	}
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
		}
		System.out.println("no element");
		return false;
	}
	public void showAllMember() {
		Iterator<Integer> ir =  hashMap.keySet().iterator();  // HashMap에서는 이터레이터를 가져올 수는 없고 key value를 선택해서 가져올 수있다.
		
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
			System.out.println(hashMap); // 해쉬맵 출력하
		}
		
	}
	
		
	
}
