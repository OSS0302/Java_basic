package ch13;

public class BitOperatorTest {

	public static void main(String[] args) {
		int num1 =5;
		int num2 =10;
		System.out.println(num1|num2);
		System.out.println(num1&num2);
		System.out.println(num1^num2);
		System.out.println(~num1); //반전 틸드 
		
		//shift 복합 대연산자
		System.out.println(num1<<2);
		System.out.println(num1<<=2);
		System.out.println(num1>>1);
		System.out.println(num1>>2);
		System.out.println(num1>>3);
	}
	

}
