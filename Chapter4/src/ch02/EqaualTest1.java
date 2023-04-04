package ch02;

public class EqaualTest1 {
	public static void main(String[] args) {
		Student1 std1 = new Student1(100,"Lee");
		Student1 std2 = new Student1(100,"Lee");
		
		
		System.out.println(std1 == std2); //다른 객체여서 false 이 뜬다
		System.out.println(std1.equals(std2)); //문자열이 같은지 확인했을때 주소값이 같은지 확인
		
		// 해쉬 코드 출력하기
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		// String 으로 보기
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(std1.equals(str2));
		//여기 서 같은 해쉬 코드 값이 나오는걸 알수있다.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// 정수값 확인하기 
		Integer i =100;
		System.out.println(i.hashCode());
	}

}
