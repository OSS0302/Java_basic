package ch12;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>(); // 중복여부를 체크하기위한 인스턴스 의 동일 한지 비교
		hashSet.add("김유신");
		hashSet.add("이순신");
		hashSet.add("홍현희");
		hashSet.add("강감찬");
		hashSet.add("김유신");
		
		System.out.println(hashSet); // 출력하기
		
	}

}
