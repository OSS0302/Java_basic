package ch10;

class constant_test {

	public static void main(String[] args) {
		//상수는 변하지 않는 수
		// 원주률 3.14 년 12개월 등등
		//final 를 예약어를 사용하여 선언 
		// 상수를 사용하려면 변하지 않는값을 반복하여 사용 할때 의미 있는 문자로 인식하기 싫고 변하더라도 선언한 부분만 변경하여 되므로 여러부분을 수정할 필요가 없다.
		// 상수는대문자 부터 사용하고 길면 언더바 을 쓴다.
		final int MAX_NUM =100;
		final int MiN_NUM = 0;
		
		//MAX_NUM =20;
		System.out.println(MAX_NUM);
		System.out.println(MiN_NUM);
	}

}
