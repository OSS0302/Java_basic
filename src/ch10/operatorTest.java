package ch10;

public class operatorTest {
	public static void main(String[] args) {
	
	//operand: 연산에 사용되는값
	//연산자 operator 항을 이용하여 연산하는 기호
	
	// 대입연산자 
	/*변수에 다른 변수나 값을 대입하는 연산자 
	 * 이항 연산자 중 우선 순위가 가장 낮은 연산자들
	 * 왼쪽 변수 = 오른쪽 변수(또는식 값)
	 // 부호연산
	 * 단항 연산
	 * 단항 연산자변수의 부호를 유지하거나 (+) 바꿈(-)
	 * 실제 변수의 부호 변하려면 대입 연산자를 사용해야한다.
	 //산술 연산자
	 */
	int num1 =10;
	int num2 =20;
	num1 +=num2;
	System.out.println(num1);
	
	int gameScore = 150;
	int lastSocre1 = ++gameScore;
	int lastSocre2= gameScore++;
	System.out.println(lastSocre1); //gameSocre +=1; gameScore =gameScore+1;
	
	System.out.println(lastSocre2);
	System.out.println(gameScore);
	
	
	}
}
