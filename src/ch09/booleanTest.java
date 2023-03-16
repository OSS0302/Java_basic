package ch09;

public class booleanTest {
	public static void main(String[] args) {
		//boolean ture(참) false 거짓 두가지 나타낸다.
		// 1바이트 사용한다.
		// 값을 존재하는지 배열이 비었는지 결과가 참인지 거짓인지 등을표현한다.
		// 모든 변수에는 사용못하고 지역변수에만 쓸수있다.
		// 지역변수 자료형 없이 사용하기 (자바 10 지원 됨)
		// 추론 가능한 변수에 대한 자료형을 선언하지않는다.
		// 한번 선언하여 추론 된 변수는 다른타입의 값을 대입 할 수있다.
		// 지역 변수만 가능하다.
		var i =10;	// 변수 integer 는 10이다.
		var j =10.0;//변수  double 
		var str ="test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;
		System.out.println(str2);
		
		str ="hello";
		
	}	
		
}
