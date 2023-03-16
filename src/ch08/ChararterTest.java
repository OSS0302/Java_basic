package ch08;

public class ChararterTest {

	public static void main(String[] args) {
		// 문자도 정수로 표현합니다.
		// 어떤 문자 를컴퓨터 내부에서표현하기 위해 정수값을 정의
		//A->65 아스키 코드 8bit 2^8 =256
		// 우리나라는 utf-16인코딩을 사용한다
		//자바 는 문자를나타내기 위해서 전세계 표준인 UNCONE를 사용
		//utf-16인코딩을 사용 모든 문자를 2바이트 표
		//문자를 위한데이터 타입 char ch ='A'; 내부적으로 숫자로 표현되므로 숫자를 넣어도 출력이 된다.
		// 자바에서 'A':2바이트문자 를 나타낸다   "A":문자열 나타낸다.
		char ch1 ='A';
		System.out.println(ch1);
		System.out.println((int)ch1);//문자를 int로 형변환 (타입캐스팅을 해라)
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		//chararter 형은 2바이트이고 유니코드 특징은  내부적으로 문자에대한 정수값을 가지고있다. 음수은 안되고 양수만 된다.
	}

}
