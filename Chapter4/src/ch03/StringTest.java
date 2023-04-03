package ch03;

public class StringTest {

	public static void main(String[] args) {
		String iphone = new String("iphone");
		String Galaxy = new String("Galaxy");
		
		System.out.println(System.identityHashCode(iphone));
		iphone = iphone.concat(Galaxy);
		
		System.out.println(System.identityHashCode(iphone));
		
	}

}
