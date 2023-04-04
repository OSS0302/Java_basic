package ch03;

public class StringTest3 {
	
	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java)); //해쉬 코드 

		java= java.concat(android); // java와 android 합치기
		System.out.println(System.identityHashCode(java)); // 연결된 해쉬코드값 
		// 결론 스트링 객체 해쉬코드 값이랑 연결된 해쉬코드 값이랑 서로 다르다.
	}

}
