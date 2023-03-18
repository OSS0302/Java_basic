package ch10;

class constant_test {

	public static void main(String[] args) {
		//상수는 변하지 않는 수
		// 원주률 3.14 년 12개월 등등
		//final 를 예약어를 사용하여 선언 
		// 상수를 사용하려면 변하지 않는값을 반복하여 사용 할때 의미 있는 문자로 인식하기 싫고 변하더라도 선언한 부분만 변경하여 되므로 여러부분을 수정할 필요가 없다.
		// 상수는대문자 부터 사용하고 길면 언더바 을 쓴다.
		// 가독성이 좋다 
		final int MAX_NUM =100;
		final int MiN_NUM = 0;
		
		//MAX_NUM =20;
		System.out.println(MAX_NUM);
		System.out.println(MiN_NUM);
	}
	// 리터럴 literal
	/*프로그램에서 사용하는 숫자 문자 논리값을 뜻한다.
	 * 리터럴 상수 풀 에 있다.
	 * 정수 리터럴 int 로 상수리터럴 double 로 저장된다.
	 * 정 범위가 넘어가는 경우 나올 float로 사용하려는 경우는 F,f 식별자를 써줘야한다.
	 *  형변환 (type conversion)
	 *  서로다른 자료형 간에 연산등 수행을 하나의 자료형으로 통일하는것
	 *  묵시적 형변환 (자동 변환)과 명시적 형변환 implicit type conversion 경제형 변환)이없다.
	 *  바이트 크기 작은 자료형에서큰 자료형으로 형변환은 자동으로 이루어진다.
	 *  일 정밀한 자료형에서 더 정밀한 자료형으로 형변환 자동으로 이루어진다.  
	 *  	 
	 */
}
