package ch03;

public class StringBiulderTest {

	public static void main(String[] args) {
		String iphone = new String("iphone");
		String Galaxy = new String("Galaxy");
		
		StringBuilder buffer= new StringBuilder(iphone);
		// 연결기전 해쉬코드 값
		System.out.println(System.identityHashCode(buffer));
		
		buffer.append(Galaxy);
		// 추가된 해쉬코드값이 서로 같아.
		System.out.println(System.identityHashCode(buffer));
		String test = buffer.toString();
		System.out.println(test);
	}

}
